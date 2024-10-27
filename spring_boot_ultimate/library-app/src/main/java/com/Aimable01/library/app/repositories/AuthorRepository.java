package com.Aimable01.library.app.repositories;

import com.Aimable01.library.app.domain.entities.AuthorEntity;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<AuthorEntity, Long> {
}
