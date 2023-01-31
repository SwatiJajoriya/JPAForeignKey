package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
                                                   //<pojo classname,primary Key type>
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
	// we can still defines queries of our own here

}
