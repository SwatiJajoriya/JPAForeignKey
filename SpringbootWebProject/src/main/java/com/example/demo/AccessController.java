package com.example.demo;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
//used for performing series of actions-method
//servlet based job and web based -Http request and response
public class AccessController {
	
Logger log=Logger.getAnonymousLogger();
	
	
	@ResponseBody
	@RequestMapping("/add")
	public String displayadd(HttpServletRequest request,HttpServletResponse response) {
		log.info("Entered into the display add method");
	int result=Integer.parseInt(request.getParameter("no1"))+Integer.parseInt(request.getParameter("no2"));
	log.info("Addition of numbers done");
	return "sum of the number are " + result;
	}
	@ResponseBody
	@RequestMapping("/sub")
	public String displaysub(HttpServletRequest request,HttpServletResponse response) {
		log.info("Entered into the display sub method");
	int result=Integer.parseInt(request.getParameter("no1"))-Integer.parseInt(request.getParameter("no2"));
	log.info("Subtraction of numbers done");
	return "sub of the numbers are " + result;
	}
	
	}


