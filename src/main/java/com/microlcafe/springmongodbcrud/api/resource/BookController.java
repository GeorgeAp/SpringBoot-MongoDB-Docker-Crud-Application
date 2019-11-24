package com.microlcafe.springmongodbcrud.api.resource;
import com.microlcafe.springmongodbcrud.api.model.Book;
import com.microlcafe.springmongodbcrud.api.repository.BookRepository;
import org.hibernate.validator.constraints.EAN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book){
        bookRepository.save(book);
        return "Added book with id: " + book.getId();
    }

    @GetMapping("/findAllBooks")
    public List<Book> getBook(){
        return bookRepository.findAll();
    }

    @GetMapping("/findAllBooks/{id}")
    public Optional<Book> getBook(@PathVariable int id){
        return bookRepository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id){
        bookRepository.deleteById(id);
        return "book deleted with id: " + id;
    }
}
