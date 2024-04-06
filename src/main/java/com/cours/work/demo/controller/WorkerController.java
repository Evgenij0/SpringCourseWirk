package com.cours.work.demo.controller;

import com.cours.work.demo.entity.Workers;
import com.cours.work.demo.service.WorkerServies;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/worker")
public class WorkerController {
    @Autowired
    private WorkerServies workerServies;

    @PostMapping()
    public void save(@RequestBody Workers workers) {
        workerServies.save(workers);
        log.info("Create new Worker: {}");
    }

    @GetMapping()
    public List<Workers> getAllClients() {
        return workerServies.getAll();
    }


}