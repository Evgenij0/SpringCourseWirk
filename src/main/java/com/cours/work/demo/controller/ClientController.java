package com.cours.work.demo.controller;

import com.cours.work.demo.entity.Client;
import com.cours.work.demo.service.ClientServies;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientServies clientServies;
//comment
    @PostMapping()
    public void save(@RequestBody Client Client) {
        log.info("Create new Client: {}");
        clientServies.save(Client);

    }
//комментарий!
    @GetMapping()
    public List<Client> getAllClients() {
        return clientServies.getAll();
    }

    
}