package com.example.demo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepo extends JpaRepository<Student, Integer>{

String query="select s from Student s join s.courses sc join sc.teachers";
String query1="select sct.tname from Student s join s.courses sc join sc.teachers sct where s.sname=?1";
String query2="select sc.cname from Student s join s.courses sc join sc.teachers sct where sct.tname=?1";

@Query(query)
public List<Student> getalldetails();
@Query(query1)
public String getteacher(String name);

@Query(query2)
public String getcourse(String name);

}


