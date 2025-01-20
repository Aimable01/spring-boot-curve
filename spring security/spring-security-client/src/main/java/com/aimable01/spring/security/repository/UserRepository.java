package com.aimable01.spring.security.repository;

import com.aimable01.spring.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
