package com.telran.demoMax2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//
public class ElectronicLibrary {
    private final List<Book> books = new ArrayList<>();
@PostMapping("/books")
    public void createBook(@RequestBody Book book) {
        books.add(book);
    }
@GetMapping("/books")
    public List<Book> getAllBooks() {
        return books;
    }
@GetMapping("/books/{id}")
    public Book getBook(@PathVariable String id) {
        Book result = null;
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return result;
    }
}
