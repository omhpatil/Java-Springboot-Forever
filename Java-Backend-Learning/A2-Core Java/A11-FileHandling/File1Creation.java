package com.main;

import java.io.File;

public class File1Creation {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Admin\\Desktop\\Input.txt");

        try{
            if(file.createNewFile()){
                System.out.println("File created: "+file.getName());
            }else {
                System.out.println("File already exits");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
