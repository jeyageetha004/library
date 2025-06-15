package com.geetha.project.library.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "books")
public class Book {
    @Id
    private String id;

    private String title;
    private String author;
    private String isbn;
    private String publishedDate;
    private int copiesAvailable;
    
}
