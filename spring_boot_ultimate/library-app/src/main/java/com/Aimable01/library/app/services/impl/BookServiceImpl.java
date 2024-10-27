package com.Aimable01.library.app.services.impl;

import com.Aimable01.library.app.domain.entities.BookEntity;
import com.Aimable01.library.app.repositories.BookRepository;
import com.Aimable01.library.app.services.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookEntity createBook(String isbn, BookEntity book) {
        book.setIsbn(isbn);
        return bookRepository.save(book);
    }
}
