package com.example.Assignment16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Assignment16Application {

	public static void main(String[] args) {
		ApplicationContext context;
		context = SpringApplication.run(Assignment16Application.class, args);

		MyRepository stud;
		stud=context.getBean(MyRepository.class);
		stud.getData();

	}

}
