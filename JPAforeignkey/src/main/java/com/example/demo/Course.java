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
public class Course {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String cname;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "course_teacher",
	joinColumns = {@JoinColumn(name="cid",referencedColumnName = "id")},
	inverseJoinColumns = {@JoinColumn(name="tid",referencedColumnName = "id")}
			)
	
	private List<Teacher> teachers;
	
}
