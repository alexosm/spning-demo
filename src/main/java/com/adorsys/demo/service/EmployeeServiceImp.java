package com.adorsys.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.adorsys.demo.exception.CustomException;
import com.adorsys.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adorsys.demo.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	EmployeeRepository repo;

	@Override
	public List<Employee> getEmployees() {
		return repo.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return repo.findById(id).orElseThrow(() -> new CustomException("Employee nicht gefunden " + id));
	}

	@Override
	public Employee createEmployee(Employee newEmployee) {
		return repo.save(newEmployee);
	}

	@Override
	public Employee updateEmployee(Employee newEmplyee, Long id) {
		return repo.findById(id).map((empOld) -> {
			empOld.setName(newEmplyee.getName());
			empOld.setCity(newEmplyee.getCity());
			empOld.setHobby(newEmplyee.getHobby());
			return repo.save(empOld);
		}).orElseGet(() -> {
			newEmplyee.setId(id);
			return repo.save(newEmplyee);
		});
	}

	@Override
	public void deleteEmployee(Long id) {
		repo.deleteById(id);
	}
}
