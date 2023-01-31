package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCont {
	
	@Autowired
	BookAuthorDAO dao;
	@Autowired
	BookRepo repos;
	@Autowired
	AuthorRepo arepo;
	@PostMapping("/insert")
	public Book insert(@RequestBody Book b) {
	return repos.save(b);
}
	@GetMapping("/getbook/{aname}")
	public String getbookname(@PathVariable("aname") String aname) {
		return repos.getbook(aname);
	}
	
	@GetMapping("/getall")
	public List<Book> getall(){
		return repos.findAll();
	}
	
	@GetMapping("/getallauthor")
	public List<Author> getallauthor(){
		return arepo.findAll();
	}

	
//	@PutMapping("/updateauthor")
//public String updateName(@RequestBody String aname,@RequestBody int id) {
//repos.updateauthor(aname, id);
//return "Updated";
//	}
	@PutMapping("/updatebookname")
public Book updateByName(@RequestBody Book book) {
	return dao.updateByName(book);
	}
	@PutMapping("/updateauthorname")
	public Author updatename(@RequestBody Author author) {
		return dao.updateAuthorName(author);
		}
	}

