package com.Aimable01.library.app.services;

import com.Aimable01.library.app.domain.entities.BookEntity;

public interface BookService {

    BookEntity createBook(String isbn, BookEntity book);
}
