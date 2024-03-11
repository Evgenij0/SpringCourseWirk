package com.cours.work.demo.service;

import com.cours.work.demo.entity.Order;
import com.cours.work.demo.entity.OrderNarad;
import com.cours.work.demo.repository.OrderNaryadRepository;
import com.cours.work.demo.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderNaryadServies {

    private final OrderNaryadRepository orderNaryadRepository;


    public void save(OrderNarad order) {
        orderNaryadRepository.save(order);
    }

    public List<OrderNarad> getAll() {
        return orderNaryadRepository.findAll();
    }


}
