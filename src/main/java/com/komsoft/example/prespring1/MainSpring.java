package com.komsoft.example.prespring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
		MessageRenderer renderer = (MessageRenderer) context.getBean("messageRenderer");
		renderer.render();
		
	}

}
