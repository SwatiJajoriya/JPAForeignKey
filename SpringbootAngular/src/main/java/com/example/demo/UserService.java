package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepo repo;
	
	public User updateUser(int id, User newUser) {
		if(repo.findById(id).isPresent()) {
			User olduser= repo.findById(id).get();
			olduser.setName(newUser.getName());
			olduser.setEmail(newUser.getEmail());
			
			olduser.setExperience(newUser.getExperience());
			olduser.setDomain(newUser.getDomain());
			
			return repo.save(olduser);
		}
		else {
			return null;
		}
	}

}
