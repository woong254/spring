package com.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext2.xml");
		
		Restaurant restaurant = context.getBean(Restaurant.class);
		
		restaurant.order();
		
		EmpService empService = 
				context.getBean(EmpService.class);
		empService.register();
	}  
}
