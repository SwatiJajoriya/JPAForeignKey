package com.ecommerce.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DAO
{
	@Autowired
	Repo repo;
	public Shoedata insert(Shoedata s) {
		
		return repo.save(s);
		}
}
