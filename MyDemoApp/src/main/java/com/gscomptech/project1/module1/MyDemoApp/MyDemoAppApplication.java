package com.gscomptech.project1.module1.MyDemoApp;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyDemoAppApplication implements CommandLineRunner {
	@Autowired
	ApplicationContext app;

	@Autowired
	private College myCollege;
	public static void main(String[] args) {
		SpringApplication.run(MyDemoAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		myCollege.print();
		
		String[] beans = app.getBeanDefinitionNames();
		for(String bean : beans) {
			System.out.println(bean);
		}
	}
}
