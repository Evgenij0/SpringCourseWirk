package com.cours.work.demo.controller;

import com.cours.work.demo.entity.Client;
import com.cours.work.demo.service.ClientServies;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping()
    //RequestHeader HttpHeaders headers - токен для авторизации
    public void save(@RequestBody Client Client, @RequestHeader HttpHeaders headers) {

        clientServies.save(Client);
        log.info("Create new Client: {}");
    }

    @GetMapping("/All")
    public List<Client> getAllClients() {
        return clientServies.getAll();
    }


}