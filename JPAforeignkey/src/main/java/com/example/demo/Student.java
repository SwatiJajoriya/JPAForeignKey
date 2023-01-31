package com.example.demo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String sname;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "student_course",
	joinColumns = {@JoinColumn(name="sid",referencedColumnName = "id")},
	inverseJoinColumns = {@JoinColumn(name="cid",referencedColumnName = "id")}
			)
	
	private List<Course> courses;
}


