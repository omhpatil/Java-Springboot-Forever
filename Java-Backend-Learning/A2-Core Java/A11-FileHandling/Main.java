package com.main;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean status = true;
        Scanner scanner = new Scanner(System.in);

        while (status) {
            System.out.println("\n=== File Handling Menu ===");
            System.out.println("1. Create a File");
            System.out.println("2. Write to a File");
            System.out.println("3. Read from a File");
            System.out.println("4. Delete a File");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    createFile(scanner);
                    break;
                case 2:
                    writeFile(scanner);
                    break;
                case 3:
                    readFile(scanner);
                    break;
                case 4:
                    deleteFile(scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    status = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }

    // Method to create a file
    private static void createFile(Scanner scanner) {
        System.out.print("Enter the name of the file to create: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + fileName);
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    // Method to write to a file
    private static void writeFile(Scanner scanner) {
        System.out.print("Enter the name of the file to write to: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        if (file.exists()) {
            System.out.print("Enter the content to write to the file: ");
            String content = scanner.nextLine();

            try (FileWriter writer = new FileWriter(file, true)) { // Append mode
                writer.write(content + "\n");
                System.out.println("Content written to the file successfully.");
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file.");
                e.printStackTrace();
            }
        } else {
            System.out.println("File does not exist. Please create it first.");
        }
    }

    // Method to read from a file
    private static void readFile(Scanner scanner) {
        System.out.print("Enter the name of the file to read: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        if (file.exists()) {
            try (Scanner fileScanner = new Scanner(file)) {
                System.out.println("\n=== File Content ===");
                while (fileScanner.hasNextLine()) {
                    System.out.println(fileScanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred while reading the file.");
                e.printStackTrace();
            }
        } else {
            System.out.println("File does not exist. Please create it first.");
        }
    }

    // Method to delete a file
    private static void deleteFile(Scanner scanner) {
        System.out.print("Enter the name of the file to delete: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        if (file.delete()) {
            System.out.println("File deleted successfully: " + fileName);
        } else {
            System.out.println("Failed to delete the file. It may not exist.");
        }
    }
}
