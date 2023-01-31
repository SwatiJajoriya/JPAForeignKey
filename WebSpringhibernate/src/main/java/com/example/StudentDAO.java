package com.example;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class StudentDAO {
	HibernateTemplate temp;

	public void setTemp(HibernateTemplate temp) {
		this.temp = temp;
	}
	
	
	//insert, update,delete
	public int insert(Student s) {
		return (Integer) temp.save(s);
	}
	
	//update
	public String update(Student s) {
		temp.saveOrUpdate(s);
		return "updated";
	}
	
	//delete
	public String delete(Student s) {
		temp.delete(s);          
		return "deleted";
	}
	
	//retrive
	public List<Student> getall(){
		String sql="from Student";
		return (List<Student>) temp.find(sql);
	}

}


