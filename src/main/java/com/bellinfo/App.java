package com.bellinfo;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("autowire-config.xml");
        Plane p = context.getBean("p", Plane.class);
        p.getEngine().display();
    	
    }
}
