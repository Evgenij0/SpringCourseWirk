package com.cours.work.demo.controller;

import com.cours.work.demo.entity.Client;
import com.cours.work.demo.entity.Order;
import com.cours.work.demo.service.ClientServies;
import com.cours.work.demo.service.OrderServies;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderServies orderServies;

    @PostMapping()
    public void save(@RequestBody Order order) {
        log.info("Create new Order: {}", order);
        orderServies.save(order);
    }

    @GetMapping()
    public List<Order> getAllClients() {
        return orderServies.getAll();
    }


}