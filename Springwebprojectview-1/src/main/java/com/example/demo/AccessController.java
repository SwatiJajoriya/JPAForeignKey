package com.example.demo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
//used for performing series of actions-method
//servlet based job and web based -Http request and response
public class AccessController {
	
	@RequestMapping("/add")
	public ModelAndView displayadd(HttpServletRequest request,HttpServletResponse response) {
	int result=Integer.parseInt(request.getParameter("no1"))+Integer.parseInt(request.getParameter("no2"));
	ModelAndView mv=new ModelAndView();
	mv.setViewName("adddisplay");
	mv.addObject("result", result);
	return mv;
	}
	
	@RequestMapping("/sub")
	public ModelAndView displaysub(HttpServletRequest request,HttpServletResponse response) {
	int result=Integer.parseInt(request.getParameter("no1"))-Integer.parseInt(request.getParameter("no2"));
	ModelAndView mv=new ModelAndView();
	mv.setViewName("subdisplay");
	mv.addObject("result", result);
	return mv;
	}

	
	
}





