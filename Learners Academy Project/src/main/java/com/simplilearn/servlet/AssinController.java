package com.simplilearn.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.simplilearn.dao.Classesdao;
import com.simplilearn.dao.AssignDao;
import com.simplilearn.pojo.ReportSubjectNTeacher;
import com.simplilearn.pojo.Classes;

/**
 * Servlet implementation class AssinController
 */
public class AssinController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssinController() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
		ReportSubjectNTeacher rp=new ReportSubjectNTeacher();
		String arr[]=request.getParameter("teacher").split(",");
		rp.setCid(Integer.parseInt(request.getParameter("cid")));
		Classesdao vf=new Classesdao();
		Classes cc=vf.getClasse(Integer.parseInt(request.getParameter("cid")));
		String name=cc.getClassName();
		rp.setClassName(name);
		
		String arr1[]=request.getParameter("teacher").split(",");
		rp.settName(arr1[1]);
		rp.setSubid(0);
		
		String arr2[]=request.getParameter("subject").split(",");
		rp.setSuBName(arr2[1]);
		rp.setTid(0);
		
		
		AssignDao assignDao=new AssignDao();
		String s=assignDao.insert(rp);
		 if(s.equalsIgnoreCase("data inserted"))
	       {
	    	  response.sendRedirect("addsubjectTeacher.jsp");
	       }
	      
	       else{
	    	   response.sendRedirect("failure.jsp");
	       }		
	}
}