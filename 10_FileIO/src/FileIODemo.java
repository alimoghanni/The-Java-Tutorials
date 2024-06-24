// 10_FileIO/FileIODemo.java
/*
 * File I/O
 * This program demonstrates reading from and writing to files in Java.
 */

import java.io.*;

public class FileIODemo {
    public static void main(String[] args) {
        String filePath = "example.txt";

        // Writing to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            writer.write("Hello, World!");
            writer.newLine();
            writer.write("Java File I/O is simple.");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Reading from a file
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read from file: " + line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
