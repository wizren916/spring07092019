package com.fsa.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/fsa/example/beans.xml");
		Person person = (Person) context.getBean("person");
		Person person2 = (Person) context.getBean("person2");

		System.out.println(person);
		System.out.println(person2);

		Address address2 = (Address) context.getBean("address2");
		System.out.println(address2);
		((ClassPathXmlApplicationContext) context).close();
	}

}
