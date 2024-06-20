package com.tech.spring.SpringApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
    public static void main( String[] args ) {
    	
		@SuppressWarnings("resource")
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("com/tech/spring/SpringApplication/BasicSpring.xml");
    	
    	Employee employee=(Employee) applicationContext.getBean("employee1");
    
    	employee.employeeDetails();
    }
}
