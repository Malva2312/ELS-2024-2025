package pt.up.fe.els2024;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class File {

    // Static method to get file info by filename
    public static void getFileInfo(String filename) {
        java.io.File myObj = new java.io.File(filename);
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File size in bytes: " + myObj.length());
            System.out.println("File extension: " + getFileExtension(myObj)); // Show file extension

            // Additional logic based on file extension
            String extension = getFileExtension(myObj);
            if (extension != null) {
                switch (extension.toLowerCase()) {
                    case "json":
                        System.out.println("This is a json file.");
                        break;
                    case "xml":
                        System.out.println("This is a xml file.");
                        break;
                    case "yaml":
                        System.out.println("This is an yaml file.");
                        break;
                    default:
                        System.out.println("Unknown file type.");
                        break;
                }
            } else {
                System.out.println("This file has no extension.");
            }
        } else {
            System.out.println("The file does not exist.");
        }
    }

    // Static method to read the file by filename
    public static void readFile(String filename) {
        try {
            java.io.File myObj = new java.io.File(filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // Helper method to get the file extension
    private static String getFileExtension(java.io.File file) {
        String fileName = file.getName();
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
            return fileName.substring(dotIndex + 1); // Get the extension without the dot
        }
        return null; // No extension found
    }

}
