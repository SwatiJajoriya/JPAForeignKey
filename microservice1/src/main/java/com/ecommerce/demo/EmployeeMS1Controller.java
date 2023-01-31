package com.ecommerce.demo;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeMS1Controller {
	@Autowired
	EmpRepo repo;
	
	Logger log=Logger.getAnonymousLogger();


	@RequestMapping("/")
	public ModelAndView loadpage(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("login.jsp");
	
	return mv;	
	}
	

	@RequestMapping("/login")
	public ModelAndView checklogin(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		String user=req.getParameter("user");
		String password=req.getParameter("pwd");
		Employee emp=repo.findByuserpwd(user, password);
		if(emp!=null) {
			mv.setViewName("display.jsp");
			mv.addObject("emp",emp);
			
		}
		else {
			mv.setViewName("fail.jsp");
		}
		return mv;
		
	}
	
	@ResponseBody
	@RequestMapping("/registermslogin")
	public String registermslogin(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
//		log.info("enetered into the register ms in login");
		String user=req.getParameter("user");
		String password=req.getParameter("pwd");
		String email=req.getParameter("email");
		RestTemplate rest=new RestTemplate();
		String url="http://localhost:8089/register-user/"+user+"/"+password+"/"+email;
//		log.info(url);
		rest.getForObject(url,String.class);
		return "registration is successfully";
}

}


