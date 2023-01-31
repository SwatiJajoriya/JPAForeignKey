package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepo extends JpaRepository<Book, Integer>{
	
String query="select b.bname from Book b join b.authors ba where ba.aname=?1";
//String query1="update Author a set a.aname=?1 where a.id=?2";

@Query(query)
public String getbook(String bname);

//@Query(query1)
//public String updateauthor(String aname,int id);



	

}
