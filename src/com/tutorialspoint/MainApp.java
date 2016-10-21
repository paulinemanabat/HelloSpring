package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		HelloWorld objPau = (HelloWorld) context.getBean("helloPau");

		obj.getMessage();
		objPau.getMessage2();
	}
}