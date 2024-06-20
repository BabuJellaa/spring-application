package com.tech.spring.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentCollectionDependencyInjection {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/tech/spring/setterinjection/SetterDIStringsBased.xml");
		
		Students students= (Students) applicationContext.getBean("userObject");
		
		students.displayStudentDetails();
	}
}