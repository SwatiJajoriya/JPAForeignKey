package com.example.demo;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;





@RestController
@CrossOrigin(origins = "*")

public class UserController {

	@Autowired
	UserRepo repo;
	
	@Autowired
	UserService uservice;
	
	//insert
	@PostMapping("/register")
	public String register(@RequestBody User user) {
		repo.save(user);
		return "Hi "+user.getName()+" your are registered successfully!!";
	}
	
	@PostMapping("/registerall")
	public List<User> registerall(@RequestBody List<User> user){
		return repo.saveAll(user);
	}

	//list of users
	@GetMapping("/getAllusers")
	public List<User> findAllusers(){
		return repo.findAll();
	}
	
	//search with email
	@GetMapping("/findemail/{email}")
	public List<User> findUser(@PathVariable String email){
		return repo.findByemail(email);
	}
	
	//delete the record
	@DeleteMapping("/cancel/{id}")
	public List<User> cancelregistration(@PathVariable int id){
		repo.deleteById(id);
		return repo.findAll();
	}
	
	@GetMapping("/getuserById/{id}")
	public User getUserById(@PathVariable int id) {
		if(repo.findById(id).isPresent()) {
			return repo.findById(id).get();
		}
		else {
			return null;
		}
	}

	
	@PutMapping("/updateuser/{id}")
	public ResponseEntity<Object> updateUser(@PathVariable int id,@RequestBody User newUser){
		User user= uservice.updateUser(id, newUser);
		
		if (user!=null)
			return new ResponseEntity<Object>(user,HttpStatus.OK);
		else
			return new ResponseEntity<Object>("No User Available to Update",HttpStatus.NOT_FOUND);
	}
	
	
}


