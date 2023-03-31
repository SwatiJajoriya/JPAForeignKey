package com.simplilearn.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.demo.entity.User;

import com.simplilearn.demo.Repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	public User addUser(User u) {
		return repo.save(u);
	}
	
	public List<User> addalluser(List<User> u){
		return repo.saveAll(u);
		
	}
	public List<User> getAllUser(){
		return repo.findAll();
	}
	public User getUserById(int id) {
		if(repo.findById(id).isPresent()) {
			return repo.findById(id).get();
		}
		else {
			return null;
		}
		
	}
	public User updateUser(int uid, User newUser) {
		if(repo.findById(uid).isPresent()) {
			User olduser= repo.findById(uid).get();
			olduser.setU_fname(newUser.getU_fname());
			olduser.setU_lname(newUser.getU_lname());
			olduser.setEmail(newUser.getEmail());
			olduser.setUusername(newUser.getUusername());
			olduser.setUpassword(newUser.getUpassword());
			olduser.setLogin(newUser.getLogin());
			
			return repo.save(olduser);
		}
		else {
			return null;
		}
	}
	
	
	public boolean deleteUser(int id) {
		if(repo.findById(id).isPresent()) {
			repo.deleteById(id);
			return true;
		}
		
		else {
			return false;
		}
	}
	
	

}