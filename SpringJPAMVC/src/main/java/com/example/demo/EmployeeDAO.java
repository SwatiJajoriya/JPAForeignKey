package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDAO {
	
//used for autogeneration of a reference for an object	
	@Autowired
	EmployeeRepo repo;

	
	public Employee insert(Employee e) {
		
		return repo.save(e);
	}
	
	public List<Employee> getall(){
		return repo.findAll();
	}
}
