package com.example.demo.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class ServerDemo {

    private final DataRepo dataRepo;

    public ServerDemo(DataRepo dataRepo) {
        this.dataRepo = dataRepo;
    }

    @GetMapping("/test")
    public String getTestMessage() {
        return "Test message";
    }

    @GetMapping("/demo/{id}")
    public Message getMessage(@PathVariable String id) {
        return dataRepo.findById(id).orElseThrow();
    }

    @PostMapping("/demo")
    public Message postMessage(@RequestBody String message) {
        return dataRepo.save(new Message(message));
    }

}
