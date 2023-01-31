package com.ecommerce.demo;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MicroserviceRegisterController {
	@Autowired
	EmpRepo repo;
//	Logger log=Logger.getAnonymousLogger();
	@ResponseBody
	@RequestMapping("/register-user/{user}/{password}/{email}")
	public String registermicroservice(HttpServletRequest req,HttpServletResponse res,@PathVariable("user") String user,@PathVariable("password") String password,@PathVariable("email") String email) {
//		log.info("enetered the ms of registration");
		Employee e=new Employee();
		e.setUser(user);
		e.setPassword(password);
		e.setEmail(email);
		Employee ee=repo.save(e);
		return "done";
	}
	
}

