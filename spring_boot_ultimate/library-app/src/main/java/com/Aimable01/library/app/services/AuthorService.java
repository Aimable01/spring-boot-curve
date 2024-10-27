package com.Aimable01.library.app.services;

import com.Aimable01.library.app.domain.entities.AuthorEntity;
import org.springframework.stereotype.Service;

@Service
public interface AuthorService {

    AuthorEntity createAuthor(AuthorEntity author);

}
