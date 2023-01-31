package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestExController {

		@Autowired
		StudentRepo repos;
		
		@PostMapping("/insert")
		public Student insert(@RequestBody Student s) {
		return repos.save(s);
	}

		@GetMapping("/getalldata")
		public List<Student> getall(){
			return repos.getalldetails();
		}
		
		@GetMapping("/getteacher/{sname}")
		public String getteachername(@PathVariable("name") String name) {
			return repos.getteacher(name);
		}
		
		@GetMapping("/getcourse/{tname}")
		public String getcoursename(@PathVariable("name") String name) {
			return repos.getcourse(name);
		}
		
		
		
	}

	


