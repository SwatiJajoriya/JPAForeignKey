package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccessController {
	
	@RequestMapping("/add")
	public ModelAndView displayadd(HttpServletRequest request,HttpServletResponse response) {
	int result=Integer.parseInt(request.getParameter("no1"))+Integer.parseInt(request.getParameter("no2"));
	ModelAndView mv=new ModelAndView();
	mv.setViewName("adddisplay.jsp");
	mv.addObject("result", result);
	return mv;
	}
	
	@RequestMapping("/sub")
	public ModelAndView displaysub(HttpServletRequest request,HttpServletResponse response) {
	int result=Integer.parseInt(request.getParameter("no1"))-Integer.parseInt(request.getParameter("no2"));
	ModelAndView mv=new ModelAndView();
	mv.setViewName("subdisplay.jsp");
	mv.addObject("result", result);
	return mv;
	}

	
	
}


