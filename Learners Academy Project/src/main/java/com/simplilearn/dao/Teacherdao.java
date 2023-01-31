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
import com.simplilearn.pojo.Teacher;
public class Teacherdao {
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
	public int insert(Teacher t){

		try {
			hiberUtil();
			// save the student object	
		
			row= (int) session.save(t);

			// commit transaction
			closeSession();          

		} catch (Exception e) {

			e.printStackTrace();
		}

		return row;
	}
//display list 
	public List<Teacher> display(){	
		hiberUtil();
		Query q=session.createQuery("from Teacher");		
		return 	q.list();
	}
	//update	
	public String update(Teacher t) {	
		hiberUtil();
		session.saveOrUpdate(t);
		closeSession();          
		return "updated";
	}
	//delete
	public String delete(Teacher t) {
		hiberUtil();
		session.delete(t);
		closeSession();          
		return "deleted";
	}
	public void closeSession()

	{
		trans.commit();
		session.close();
	}
}



