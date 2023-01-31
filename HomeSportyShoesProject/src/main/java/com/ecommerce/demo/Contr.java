package com.ecommerce.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;



@Controller
public class Contr {
	@Autowired
	DAO dao;
	@PostMapping("/insert")
	public Shoedata insert(@RequestBody Shoedata s,MultipartFile file ) {
			
			return dao.insert(s);
		}
}
