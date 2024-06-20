package com.tech.spring.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependentObjectDependencyInjection {
	public static void main(String[] args) {
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("com/tech/spring/setterinjection/SetterDIStringsBased.xml");
		
		EmployeesInfo info= (EmployeesInfo) applicationContext.getBean("employeeDependentObject");
		info.getEmployeeDetails();
		System.out.println();
		info.getDetailsByDependentObject();
	}
}
