package com.main;

import com.main.entity.Book;
import tools.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonToJavaConverter {
    public static void main(String[] args) throws Exception {
        File jsonFile = new File("book.json");
        ObjectMapper mapper = new ObjectMapper();
        Book book = mapper.readValue(jsonFile, Book.class);
        System.out.println(book);
    }
}
