package com.example.demo;

import java.util.List;
import java.util.Optional;
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
	public List<Employee> insertall(List<Employee> emp){
		return repo.saveAll(emp);
	}
	
	public Optional<Employee> getbyid(int id){
		return repo.findById(id);
	}
	
	public String deletebyid(int id) {
		repo.deleteById(id);
		return "deleted id of " +id;
	}
	
	public Employee updateByName(Employee e) {
		Employee ee=repo.findById(e.getEmpno()).orElse(null);
		ee.setEmpname(e.getEmpname());
		ee.setPhono(e.getPhono());
	return	repo.save(ee);
		
	}
	
	
	//customize query
	public String findbyname(String name,int id){
		return repo.findByname(name, id);
	}
}


