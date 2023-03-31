package com.ecommerce.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;



import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Contr {
	@Autowired
	DAO dao;
	private final String FOLDER_PATH="D:\\Project image\\";
	
	@RequestMapping("/insert")
    public ModelAndView insert(HttpServletRequest req,HttpServletResponse res, @RequestParam("name") String name,@RequestParam("price") String price,@RequestParam("file") MultipartFile file) {
		ModelAndView mv=new ModelAndView();
		Shoedata s=new Shoedata();
		s.setName(name);
		s.setPrice(price);
		String fileinfo=FOLDER_PATH+file.getOriginalFilename();
		s.setFilePath(fileinfo);
		Shoedata sd=dao.insert(s);
		if(sd!=null) {
			mv.setViewName("success.jsp");
		}
		return mv;
	}

	@RequestMapping("/getall")
	public ModelAndView getall(HttpServletRequest req,HttpServletResponse res){
        ModelAndView mv=new ModelAndView();
		List<Shoedata> list=dao.getall();
		mv.setViewName("display.jsp");
		mv.addObject("list",list);
		return mv;
	}

		
	}

