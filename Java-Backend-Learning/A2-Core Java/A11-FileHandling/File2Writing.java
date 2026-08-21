package com.main;

import java.io.FileWriter;
import java.io.IOException;

public class File2Writing {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Admin\\Desktop\\Input.txt");
            writer.write("Hello, this is file handling in Java.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
