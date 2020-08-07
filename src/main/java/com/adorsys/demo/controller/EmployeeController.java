package com.adorsys.demo.controller;

import com.adorsys.demo.entity.Employee;
import com.adorsys.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return service.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return service.getEmployeeById(id);
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee newEmployee) {
        return service.createEmployee(newEmployee);
    }

    @PutMapping("employees/{id}")
    public Employee updateEmployee(@RequestBody Employee newEmployee, @PathVariable Long id){
        return service.updateEmployee(newEmployee, id);
    }

    @DeleteMapping("employees/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        service.deleteEmployee(id);
    }
}
