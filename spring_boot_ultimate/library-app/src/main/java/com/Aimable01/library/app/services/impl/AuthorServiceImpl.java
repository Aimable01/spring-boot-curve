package com.Aimable01.library.app.services.impl;

import com.Aimable01.library.app.domain.entities.AuthorEntity;
import com.Aimable01.library.app.repositories.AuthorRepository;
import com.Aimable01.library.app.services.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorEntity createAuthor(AuthorEntity author) {
        return authorRepository.save(author);
    }
}
