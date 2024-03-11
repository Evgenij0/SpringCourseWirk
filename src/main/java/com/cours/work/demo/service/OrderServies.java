package com.cours.work.demo.service;

import com.cours.work.demo.entity.Client;
import com.cours.work.demo.entity.Order;
import com.cours.work.demo.repository.ClientRepository;
import com.cours.work.demo.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServies {

    private final OrderRepository orderRepository;


    public void save(Order order) {
        orderRepository.save(order);
    }

    public List<Order> getAll() {
        return orderRepository.findAll();
    }


}
