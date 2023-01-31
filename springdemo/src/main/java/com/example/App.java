package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
//        Airtel airtel=new Airtel();
//        airtel.typeOfSim();
//IoC
    	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
    	
    	//v can call through class 
    	//Airtel airtel=(ac.getBean("Airtel.class"));
    	
    	//or id name.
    	Airtel airtel=(Airtel) (ac.getBean("airtel"));
    	airtel.typeOfSim();
    	airtel.datatypeofSim();
    }

}
