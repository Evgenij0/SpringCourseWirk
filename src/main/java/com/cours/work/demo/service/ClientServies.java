package com.cours.work.demo.service;

import com.cours.work.demo.entity.Client;
import com.cours.work.demo.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServies {

    private final ClientRepository clientRepository;

    public void save(Client client) {
        clientRepository.save(client);
    }

    public List<Client> getAll() {
        return clientRepository.findAll();
    }


}
