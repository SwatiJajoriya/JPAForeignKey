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
	ApplicationContext ac=new ClassPathXmlApplicationContext("Coffeemachine.xml");
    	
	Capacino capacino=(Capacino)(ac.getBean("capacino"));
	capacino.typeofcoffee();
	capacino.rateofcoffee();
	System.out.println(capacino.getCream());

    }

    }

