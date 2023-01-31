package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class JunitcodeTestApplicationTests {
	
 @Autowired
	EmployeeDAO dao;
	@Ignore
	@Test
	public void test1() {
		System.out.println("inside the test");
		Employee e=new Employee();
		e.setEmpname("Rahul");
		e.setPhono("13456");
		assertNotNull(dao.insert(e));
	}

	@Test
	public void test2() {
		assertEquals("deleted id of 2",dao.deletebyid(2));
		
	}

}




