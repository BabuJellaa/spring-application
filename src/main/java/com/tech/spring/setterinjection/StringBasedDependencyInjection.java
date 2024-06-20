package com.tech.spring.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StringBasedDependencyInjection {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("com/tech/spring/setterinjection/SetterDIStringsBased.xml");
		
		User user= (User) applicationContext.getBean("user");
		
		user.getUserDetails();
		
	}
}
