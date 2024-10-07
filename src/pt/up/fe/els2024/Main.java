package pt.up.fe.els2024;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.LoaderOptions;

import java.io.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Main {

	// Classe para mapear os campos a serem extraídos
	public static class FieldMapping {
		public String source;
		public String target;
	}

	// Classe para mapear cada arquivo no config.yaml
	public static class FileSource {
		public String path;
	}

	// Classe para mapear cada entrada da tree
	public static class TreeMapping {
		public String source;
		public String target;
	}

	// Classe principal para mapear o conteúdo do YAML, incluindo arquivos, campos e tree
	public static class Config {
		public List<FileSource> files;
		public List<FieldMapping> fields;
		public List<TreeMapping> tree;
	}

	public static void main(String[] args) {
		String configFilePath = "src/pt/up/fe/els2024/config.yaml";
		String csvOutputPath = "output.csv";

		// Tenta ler o arquivo YAML
		try {
			LoaderOptions options = new LoaderOptions();
			Yaml yaml = new Yaml(new Constructor(Config.class, options));
			InputStream inputStream = Files.newInputStream(Paths.get(configFilePath));
			Config config = yaml.load(inputStream);

			// Exportar os dados para um CSV
			try (PrintWriter writer = new PrintWriter(new File(csvOutputPath))) {
				// Cabeçalhos do CSV
				StringBuilder sb = new StringBuilder();
				sb.append("File,");
				for (FieldMapping field : config.fields) {
					sb.append(field.target).append(",");  // Adiciona os nomes dos campos do CSV
				}
				sb.append("Tree Nodes\n");  // Adiciona a coluna da árvore

				// Itera sobre todos os arquivos no arquivo config.yaml
				for (FileSource fileSource : config.files) {
					Map<String, Object> yamlData = readYaml(fileSource.path);
					StringBuilder line = new StringBuilder();
					line.append(fileSource.path).append(",");  // Adiciona o nome do arquivo

					// Itera sobre os parsings dos campos
					for (FieldMapping field : config.fields) {
						Object value = extractValue(yamlData, field.source);
						line.append(value != null ? value : "").append(",");  // Adiciona o valor ou uma string vazia
					}

					// Extrai a tree
					List<List<Object>> nodes = (List<List<Object>>) extractValue(yamlData, "tree_.nodes");
					StringBuilder treeNodes = new StringBuilder();
					if (nodes != null) {
						for (List<Object> node : nodes) {
							treeNodes.append(Arrays.toString(node.toArray())).append(" | ");  // Formata os nodes da tree
						}
					}
					line.append(treeNodes.length() > 0 ? treeNodes.substring(0, treeNodes.length() - 3) : "");  // Remove a última barra

					sb.append(line).append("\n");  // Adiciona a linha ao StringBuilder
				}

				writer.write(sb.toString());
				System.out.println("Dados exportados com sucesso para o arquivo CSV: " + csvOutputPath);
			} catch (FileNotFoundException e) {
				System.err.println("Erro ao criar o arquivo CSV: " + e.getMessage());
			}

		} catch (IOException e) {
			System.err.println("Erro ao carregar arquivo de configuração: " + e.getMessage());
		}
	}

	// Lê um arquivo YAML e o converte para um mapa
	private static Map<String, Object> readYaml(String path) {
		Yaml yaml = new Yaml();
		try (InputStream inputStream = Files.newInputStream(Paths.get(path))) {
			return yaml.load(inputStream);
		} catch (IOException e) {
			System.err.println("Erro ao ler o arquivo YAML: " + e.getMessage());
			return Collections.emptyMap();
		}
	}

	// Extrai o valor baseado numa string de path, como "params.criterion"
	private static Object extractValue(Map<String, Object> yamlData, String path) {
		String[] keys = path.split("\\.");
		Object value = yamlData;

		for (String key : keys) {
			if (value instanceof Map) {
				value = ((Map<?, ?>) value).get(key);
			} else if (value instanceof List) {
				try {
					int index = Integer.parseInt(key);
					value = ((List<?>) value).get(index);
				} catch (NumberFormatException | IndexOutOfBoundsException e) {
					return null;
				}
			} else {
				return null;
			}
		}
		return value;
	}
}
