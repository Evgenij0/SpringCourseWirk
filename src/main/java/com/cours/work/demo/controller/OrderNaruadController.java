package com.cours.work.demo.controller;

import com.cours.work.demo.entity.OrderNarad;
import com.cours.work.demo.service.OrderNaryadServies;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/orderNaruad")
public class OrderNaruadController {
    @Autowired
    private OrderNaryadServies orderNaryadServies;

    @PostMapping()
    public void save(@RequestBody OrderNarad orderNarad) {
        orderNaryadServies.save(orderNarad);
        log.info("Create new OrderNaruad: {}");
    }

    @GetMapping()
    public List<OrderNarad> getAllClients() {
        return orderNaryadServies.getAll();
    }


}