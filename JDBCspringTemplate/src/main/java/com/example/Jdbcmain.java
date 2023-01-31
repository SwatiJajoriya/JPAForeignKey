package com.example;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Jdbcmain {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("springJDBC.xml");
	
	System.out.println("retrive the student data");
	StudentDAO dao=ac.getBean(StudentDAO.class);
	List<Student> student=dao.getallstudents();
	for(Student ss:student) {
		System.out.println(ss);
	}

//	Scanner sc=new Scanner(System.in);
//	Student student=ac.getBean(Student.class);
//	StudentDAO dao=ac.getBean(StudentDAO.class);
//	System.out.println("enter the id value");
//	student.setId(sc.nextInt());
//	System.out.println("enter the name value");
//	student.setName(sc.next());
//	System.out.println("enter the email value");
//	student.setEmail(sc.next());
//	if(dao.insert(student)>0) {
//		System.out.println("insertion is successfull");
//	}
//	else {
//		System.out.println("insertion failed");
//	}
//	if(dao.update(student)>0) {
//		System.out.println("updation is successfull");
//	}
//	else {
//		System.out.println("updation failed");
//	}
	
//	if(dao.delete(student)>0) {
//		System.out.println("deletion is successfull");
//	}
//	else {
//		System.out.println("deletion failed");
//	}
	
}
}
