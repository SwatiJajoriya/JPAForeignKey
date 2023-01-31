package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Employee {
	
	@Id
	private int empno;
	private String empname;
	private String phono;

}
