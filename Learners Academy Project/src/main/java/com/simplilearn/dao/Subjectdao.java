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
import com.simplilearn.pojo.Subject;
public class Subjectdao {
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
	public int insert(Subject sub){
		try {
			hiberUtil();
			// save the student object	

			row= (int) session.save(sub);

			// commit transaction
			closeSession();          

		} catch (Exception e) {

			e.printStackTrace();
		}
		return row;
		}
	//display list 
	public List<Subject> display(){	
		hiberUtil();
		Query q=session.createQuery("from Subject");		
		return 	q.list();
	}
	//update	
	public String update(Subject sub) {	
		hiberUtil();
		session.saveOrUpdate(sub);
		closeSession();          
		return "updated";
	}
	//delete
	public String delete(Subject sub) {
		hiberUtil();
		session.delete(sub);
		closeSession();          
		return "deleted";
	}
	public void closeSession()

	{
		trans.commit();
		session.close();
	}
}




