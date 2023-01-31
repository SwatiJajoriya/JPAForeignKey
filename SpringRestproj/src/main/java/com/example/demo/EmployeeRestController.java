package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {
@Autowired
EmployeeDAO dao;

@PostMapping("/insert")
public Employee insert(@RequestBody Employee e) {
	return dao.insert(e);
}


@GetMapping("/getall")
public List<Employee> getall(){
	return dao.getall();
}


//insert a list of objects
@PostMapping("/insertall")
public List<Employee> insertall(@RequestBody List<Employee> emp){
	return dao.insertall(emp);
}


//get record by id
@GetMapping("/getbyid/{id}")
public Optional<Employee> getbyid(@PathVariable("id") int id) throws ResourceNotFoundException{
	if(dao.getbyid(id).isEmpty()) {
		throw new ResourceNotFoundException("id is not found");
	}
	else {
		return dao.getbyid(id);
	}
}

@DeleteMapping("deletebyid/{id}")
public String deletebyid(@PathVariable("id") int id) {
	dao.deletebyid(id);
	return "deleted the id value of "+ id;
}

@PutMapping("/update")
public Employee updateByName(@RequestBody Employee e) {
	return dao.updateByName(e);
}
@GetMapping("/getbyname/{name}/{id}")
public String findbyname(@PathVariable("name") String name,@PathVariable("id") int id) throws Exception{
	if(dao.findbyname(name, id)!=null) {
		return dao.findbyname(name, id);
	}
	else {
		throw new Exception("the name and the id is not found");
	}
}
}





