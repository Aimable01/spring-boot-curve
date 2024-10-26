package com.Aimable01.library.app.repositories;

import com.Aimable01.library.app.domain.Author;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
