package com.main;

import java.io.File;

public class File4Deletion {
    public static void main(String[] args) {
                File file = new File("C:\\Users\\Admin\\Desktop\\Input.txt");
                if (file.delete()) {
                    System.out.println("Deleted the file: " + file.getName());
                } else {
                    System.out.println("Failed to delete the file.");
                }
    }
}
