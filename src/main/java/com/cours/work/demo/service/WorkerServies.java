package com.cours.work.demo.service;

import com.cours.work.demo.entity.Client;
import com.cours.work.demo.entity.Workers;
import com.cours.work.demo.repository.ClientRepository;
import com.cours.work.demo.repository.WorkersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkerServies {

    private final WorkersRepository workersRepository;


    public void save(Workers workers) {
        workersRepository.save(workers);
    }

    public List<Workers> getAll() {
        return workersRepository.findAll();
    }


}
