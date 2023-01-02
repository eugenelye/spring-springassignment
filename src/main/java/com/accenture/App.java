package com.accenture;

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
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Home home = context.getBean("home", Home.class);
		System.out.println(home);
		home.homeInfo();
		
    }
}
