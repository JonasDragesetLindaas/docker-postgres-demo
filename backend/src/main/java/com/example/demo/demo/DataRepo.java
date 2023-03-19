package com.example.demo.demo;

import org.springframework.data.repository.CrudRepository;

public interface DataRepo extends CrudRepository<Message, String> {
}
