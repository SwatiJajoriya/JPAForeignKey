package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
                                                   //<pojo classname , primary key type>
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

	//we can still define queires of our own over here 
	@Query("select employee.phono from Employee employee where employee.empname=?1 and employee.empno=?2")
	public String findByname(String name,int id);
	
}
