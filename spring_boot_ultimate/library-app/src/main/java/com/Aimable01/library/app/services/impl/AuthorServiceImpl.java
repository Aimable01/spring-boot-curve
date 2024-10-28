package com.Aimable01.library.app.services.impl;

import com.Aimable01.library.app.domain.entities.AuthorEntity;
import com.Aimable01.library.app.repositories.AuthorRepository;
import com.Aimable01.library.app.services.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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

    @Override
    public List<AuthorEntity> findAll() {
        return StreamSupport.stream(authorRepository
                .findAll()
                .spliterator(),
                false
        ).collect(Collectors.toList());
    }
}
