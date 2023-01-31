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

import lombok.Data;

@Data
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String bname;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "book_author",
	joinColumns = {@JoinColumn(name="bid",referencedColumnName = "id")},
	inverseJoinColumns = {@JoinColumn(name="aid",referencedColumnName = "id")}
			)
	
	private List<Author> authors;

}
