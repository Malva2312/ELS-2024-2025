package pt.up.fe.els2024;

public class Main {

	public static void main(String[] args) {
		// Hardcode the filename here
		String filename = "assignment1Files/decision_tree_1.json";

		// Call the ReadFile class method to read the file
		File.getFileInfo(filename);
		File.readFile(filename);
	}
}
