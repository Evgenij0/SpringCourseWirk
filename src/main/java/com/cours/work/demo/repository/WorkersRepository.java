package com.cours.work.demo.repository;

import com.cours.work.demo.entity.Workers;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WorkersRepository extends CrudRepository <Workers, Long> {
    List<Workers> findAll();
}
