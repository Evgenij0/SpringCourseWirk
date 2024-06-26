package com.cours.work.demo.repository;

import com.cours.work.demo.user.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository  extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);
    List<User> findAll();
}