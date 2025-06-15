package com.geetha.project.library.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.geetha.project.library.model.Book;

public interface BookRepository extends MongoRepository<Book, String> {
}
