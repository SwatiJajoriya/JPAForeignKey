package com.ecommerce.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmpRepo extends JpaRepository<Employee, String> {
@Query("select employee from Employee employee where employee.user=?1 and employee.password=?2")
	public Employee findByuserpwd(String username,String password);

	
}


