package com.aimable01.spring_security.repo;

import com.aimable01.spring_security.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<Users, Integer> {

    Optional<Users> findByUsername(String username);
}
