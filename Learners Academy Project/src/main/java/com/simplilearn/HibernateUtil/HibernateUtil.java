package com.simplilearn.HibernateUtil;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	
private static SessionFactory sessionFactory;

	  public static SessionFactory getSessionFactory() {
		  
	         
	            try {
	            	
	                 StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	         		//Meta data in the config file should be executed	
	         		Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
	         		//read session factory in the xml
	         		SessionFactory sf=md.getSessionFactoryBuilder().build();
	           

	              } catch (Exception e) {
	                 e.printStackTrace();
	              }
	          
	        return sessionFactory;
	    }
	}


