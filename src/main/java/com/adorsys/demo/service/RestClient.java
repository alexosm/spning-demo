package com.adorsys.demo.service;

import com.adorsys.demo.entity.ToDo;

import java.util.List;

public interface RestClient {
    public List<ToDo> getTodos();
}