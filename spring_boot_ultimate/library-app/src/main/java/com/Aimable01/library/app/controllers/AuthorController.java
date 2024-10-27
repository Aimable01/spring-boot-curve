package com.Aimable01.library.app.controllers;

import com.Aimable01.library.app.domain.dto.AuthorDto;
import com.Aimable01.library.app.services.AuthorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping(path = "/authors")
    public AuthorDto createAuthor(@RequestBody AuthorDto author) {
        return authorService.createAuthor(author);
    }
}
