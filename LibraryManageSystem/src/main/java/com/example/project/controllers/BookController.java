package com.example.project.controllers;

import com.example.project.dtos.CreateBookRequest;
import com.example.project.models.Book;
import com.example.project.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/book")
    public void addBook(@RequestBody @Valid CreateBookRequest createBookRequest){
        bookService.create(createBookRequest.to());
    }

    @GetMapping("/searchBook")
    public List<Book> getBooks(@RequestParam("key") String key,@RequestParam("value") String value) throws Exception{
        return bookService.getAllBooks(key,value);
    }
}
