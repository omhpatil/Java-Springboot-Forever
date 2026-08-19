package com.main;

import com.main.entity.Author;
import com.main.entity.Book;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tools.jackson.databind.ObjectMapper;

import java.io.File;

@SpringBootApplication
public class JavaToJsonConverter {

    public static void main(String[] args) throws Exception {
        Author author = new Author();
        author.setAuthorName("Om Patil");
        author.setAuthorEmail("patilom887@gmail.com");
        author.setAuthorPhno(123456789l);

        Book book = new Book();
        book.setId(101);
        book.setName("Spring By OP");
        book.setPrice(777.00);
        book.setAuthor(author);

        ObjectMapper mapper = new ObjectMapper();
        // converting java obj to json and store into a file

        // you will get this book.json file in parent project folder (outside all the files)
        mapper.writeValue(new File("book.json"), book);

        System.out.println("Conversion Completed....");

    }
}