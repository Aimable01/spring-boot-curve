package com.Aimable01.json.controllers;

import com.Aimable01.json.domain.Book;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class BookController {

    @GetMapping(path = "/books")
    public Book retrieveBook(){
        return Book.builder()
                .isbn("123-456-789")
                .title("The River Between")
                .author("Chinua Achebe")
                .yearPublished("2005")
                .build();
    }

    @PostMapping(path = "/books")
    public Book createBook(@RequestBody final Book book){
        log.info("Got book" + book.toString());
        return book;
    }
}
