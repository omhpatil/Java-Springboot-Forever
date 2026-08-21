package com.main;

import java.io.*;
import java.util.Scanner;

public class File3Reading {
    public static void main(String[] args) {
//        try {
//            File file = new File("C:\\Users\\Admin\\Desktop\\Input.txt");
//            Scanner scanner = new Scanner(file);
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                System.out.println(line);
//            }
//            scanner.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }

        try {
            FileReader fileReader = new FileReader("C:\\Users\\Admin\\Desktop\\Input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
