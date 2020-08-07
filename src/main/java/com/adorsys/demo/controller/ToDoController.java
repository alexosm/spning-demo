package com.adorsys.demo.controller;

import com.adorsys.demo.entity.ToDo;
import com.adorsys.demo.service.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoController {

    @Autowired
    RestClient restClient;

    @GetMapping("/todos")
    public List<ToDo> gettoDos() {
        return restClient.getTodos();
    }
}
