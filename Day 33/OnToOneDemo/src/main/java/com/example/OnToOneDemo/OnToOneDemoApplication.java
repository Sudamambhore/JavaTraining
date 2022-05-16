package com.example.OnToOneDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OnToOneDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context = SpringApplication.run(OnToOneDemoApplication.class, args);
		RoleRepository role;
		role = context.getBean(RoleRepository.class);
		
		EmpRepository emp;
		emp = context.getBean(EmpRepository.class);
		
		Role r1 = new Role(1,"Project Engineer");
		role.save(r1);
		
		Emp e1 = new Emp(100,"Sudam",r1);
		emp.save(e1);
		
		Role r2 = new Role(2,"System Engineer");
		role.save(r2);
		
		Emp e2 = new Emp(200,"Arjun",r2);
		emp.save(e2);
		
		Role r3 = new Role(3,"Software Engineer");
		role.save(r3);
		
		Emp e3 = new Emp(300,"Pravin",r3);
		emp.save(e3);
		
	}

}


