package com.tech.spring.componentAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EnrollmentDetails {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("com/tech/spring/componentAnnotation/GravtyDetails.xml");
		
		GravtyEnrollmentUser enrollmentUser= (GravtyEnrollmentUser) applicationContext.getBean("gravtenrollmentuser");
		enrollmentUser.getUserDetails();
	}
}
