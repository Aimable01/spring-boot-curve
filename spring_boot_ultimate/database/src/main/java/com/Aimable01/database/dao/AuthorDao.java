package com.Aimable01.database.dao;

import com.Aimable01.database.domain.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorDao {
    void create(Author author);

    Optional<Author> findOne(long id);
    List<Author> find();

    void update(long id,Author author);
}
