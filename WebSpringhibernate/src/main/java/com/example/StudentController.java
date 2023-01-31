
package com.example;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@RequestMapping("/insert")
	public ModelAndView insert(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Student s=ac.getBean(Student.class);
		s.setEmail(request.getParameter("email"));
		s.setPhono(request.getParameter("phono"));
		StudentDAO dao=ac.getBean(StudentDAO.class);
		int row=dao.insert(s);
		if(row>0) {
			mv.setViewName("display.jsp");
		}
		else {
			mv.setViewName("error.jsp");
		}
		return mv;
	
	}
	
	@RequestMapping("/update")
	public ModelAndView update(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Student s=ac.getBean(Student.class);
		s.setSid(Integer.parseInt(request.getParameter("sid")));
		s.setEmail(request.getParameter("email"));
		s.setPhono(request.getParameter("phono"));
		StudentDAO dao=ac.getBean(StudentDAO.class);
		String row =dao.update(s);
		if(row!=null) {
			mv.setViewName("display.jsp");
		}
		else {
			mv.setViewName("error.jsp");
		}
		return mv;
	
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Student s=ac.getBean(Student.class);
		StudentDAO dao=ac.getBean(StudentDAO.class);
		s.setSid(Integer.parseInt(request.getParameter("sid")));
		String st=dao.delete(s);
		if(st.equals("deleted")) {
			mv.setViewName("display.jsp");
		}
		else {
			mv.setViewName("error.jsp");
		}
		return mv;
	
	}
	
	@RequestMapping("/display")
public ModelAndView display(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		StudentDAO dao=ac.getBean(StudentDAO.class);
		List<Student> list=dao.getall();
		mv.setViewName("displayall.jsp");
		mv.addObject("list",list);
		return mv;
	}
	
}

