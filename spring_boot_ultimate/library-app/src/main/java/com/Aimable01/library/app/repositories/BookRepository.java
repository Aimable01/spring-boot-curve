package com.Aimable01.library.app.repositories;

import com.Aimable01.library.app.domain.entities.BookEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookEntity, String> {
}
