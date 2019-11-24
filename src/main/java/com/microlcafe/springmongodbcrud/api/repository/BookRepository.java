package com.microlcafe.springmongodbcrud.api.repository;

import com.microlcafe.springmongodbcrud.api.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
