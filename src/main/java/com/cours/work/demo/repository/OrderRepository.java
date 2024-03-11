package com.cours.work.demo.repository;

import com.cours.work.demo.entity.Client;
import com.cours.work.demo.entity.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository <Order, Long> {
    List<Order> findAll();
}
