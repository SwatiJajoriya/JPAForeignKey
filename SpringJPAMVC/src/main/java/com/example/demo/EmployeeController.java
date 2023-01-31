package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDAO dao;
	@RequestMapping("/")
	public ModelAndView displaypage(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
	}
	
	@RequestMapping("/insert")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Employee e=new Employee();
		e.setEmpno(Integer.parseInt(request.getParameter("empno")));
		e.setEmpname(request.getParameter("empname"));
		e.setPhono(request.getParameter("phono"));
		Employee ep=dao.insert(e);
		if(ep!=null) {
			mv.setViewName("display.jsp");
		}
		return mv;
	}

	@RequestMapping("/getall")
	public ModelAndView displayAll(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
	List<Employee> list=dao.getall();
	mv.setViewName("displayres.jsp");
	mv.addObject("list",list);	
		return mv;
	}
}

	

