package com.example.demo;

import javax.swing.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context;
		context = SpringApplication.run(DemoApplication.class, args);
		studentRepository stud = context.getBean(studentRepository.class);
		// Create row
		student st = new student(500, "SANKET");
		// stud.save(st);
		stud.delete(st);
		// System.out.println("Record save Successfully");
		System.out.println("Record Deleted Successfully");

	}

}
