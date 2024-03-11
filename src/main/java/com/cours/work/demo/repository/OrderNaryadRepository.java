package com.cours.work.demo.repository;

import com.cours.work.demo.entity.Client;
import com.cours.work.demo.entity.Order;
import com.cours.work.demo.entity.OrderNarad;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderNaryadRepository extends CrudRepository <OrderNarad, Long> {
    List<OrderNarad> findAll();
}
