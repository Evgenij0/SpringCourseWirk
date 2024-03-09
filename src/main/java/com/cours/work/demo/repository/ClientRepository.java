package com.cours.work.demo.repository;

import com.cours.work.demo.entity.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository  extends CrudRepository <Client, Long> {
    List<Client> findAll();
}
