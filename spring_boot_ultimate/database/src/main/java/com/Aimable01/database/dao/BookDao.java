package com.Aimable01.database.dao;

import com.Aimable01.database.domain.Book;

import java.util.Optional;

public interface BookDao {
    void create(Book book);

    Optional<Book> find(String isbn);
}
