package com.example.OneToManyDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class OneToManyDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context = SpringApplication.run(OneToManyDemoApplication.class, args);
		RoleRepository role;
		role = context.getBean(RoleRepository.class);
		
		EmpRepository emp;
		emp = context.getBean(EmpRepository.class);
		
		Role r1 = new Role(1,"Project Engineer");
		role.save(r1);
		
	
		
	}

}
