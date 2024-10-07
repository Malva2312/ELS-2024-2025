package pt.up.fe.els2024;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.LoaderOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class Main {

	// Classe para mapear a configuração YAML
	public static class Config {
		public List<Source> sources;
	}

	public static class Source {
		public String file;
	}

	public static void main(String[] args) {
		String configFilePath = "src/pt/up/fe/els2024/config.yaml";

		Config config = loadConfig(configFilePath);

		// Iterar sobre os arquivos especificados e imprimir o conteúdo
		if (config != null && config.sources != null) {
			for (Source source : config.sources) {
				String filePath = source.file;
				System.out.println("Conteúdo do arquivo: " + filePath);
				printFileContent(filePath);
			}
		}
	}

	// Metodo para carregar o arquivo de configuração YAML
	private static Config loadConfig(String filePath) {
		try (FileInputStream inputStream = new FileInputStream(new File(filePath))) {
			LoaderOptions options = new LoaderOptions();
			Yaml yaml = new Yaml(new Constructor(Config.class, options));
			return yaml.load(inputStream);
		} catch (IOException e) {
			System.err.println("Erro ao carregar arquivo de configuração: " + e.getMessage());
			return null;
		}
	}

	// Metodo para imprimir o conteúdo de um arquivo
	private static void printFileContent(String filePath) {
		try (FileInputStream inputStream = new FileInputStream(new File(filePath))) {
			Yaml yaml = new Yaml();
			Object data = yaml.load(inputStream);
			System.out.println(data);
		} catch (IOException e) {
			System.err.println("Erro ao carregar arquivo YAML: " + e.getMessage());
		}
	}
}
