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
import com.simplilearn.pojo.Student;
public class Studentdao {
StandardServiceRegistry ssr;
	Metadata md;
	SessionFactory sf;
	Transaction trans;
	Session session;
	int row=0;
	Classes c;
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
	public int insert(Student student){

		try {
			hiberUtil();
			// save the student object	
		
			row= (int) session.save(student);

			// commit transaction
			closeSession();          

		} catch (Exception e) {

			e.printStackTrace();
		}

		return row;
}
	//display list 
	public List<Student> display(){	
		hiberUtil();
		Query q=session.createQuery("from Student");		
		return 	q.list();
	}
	//update	
	public String update(Student student) {	
		hiberUtil();
		session.saveOrUpdate(student);
		closeSession();          
		return "updated";
	}
	//delete
	public String delete(Student student) {
		hiberUtil();
		session.delete(student);
		closeSession();          
		return "deleted";
	}
		public	List<Student> getAllData(int id){
		hiberUtil();
		Query q=session.createQuery("from Student where classId="+id);

		return q.list();
	}
	public void closeSession()

	{
		trans.commit();
		session.close();
	}
}


