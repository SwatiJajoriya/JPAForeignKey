package com.simplilearn.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import com.simplilearn.pojo.Classes;

public class Classesdao {
StandardServiceRegistry ssr;
	Metadata md;
	SessionFactory sf;
	Transaction trans;
	Session session;
	int row=0;
	public void hiberUtil()
	{
		try {
			ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			md=new MetadataSources(ssr).getMetadataBuilder().build();
			sf=md.getSessionFactoryBuilder().build();
			session = sf.openSession();
			trans = session.beginTransaction();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}	
//save 
	public int insert(Classes c){
		try {
			hiberUtil();
			row = (int) session.save(c);
			closeSession();          
		} catch (Exception e) {

			e.printStackTrace();
		}
		return row;
	}
		//display list of classes
	public List<Classes> display(){
			hiberUtil();
			Query q=session.createQuery("from Classes");		
		return 	q.list();
	}
		
	public Classes getClasse(int id) {
		hiberUtil();
		Classes c=session.get(Classes.class, id);
		closeSession(); 
		return c;
		
	}		
	//update	
	public String update(Classes c) {	
		hiberUtil();
	 session.saveOrUpdate(c);
		closeSession();          
	return "updated";
}	
	//delete
	public String delete(Classes c) {
			hiberUtil();
		session.delete(c);
		closeSession();          
	return "deleted";
}
public void closeSession()
	{
		trans.commit();
		session.close();
	}
}
