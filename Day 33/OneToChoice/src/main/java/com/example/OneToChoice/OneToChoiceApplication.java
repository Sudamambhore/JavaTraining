package com.example.OneToChoice;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OneToChoiceApplication {

	public static void main(String[] args) {
		//SpringApplication.run(OneToChoiceApplication.class, args);
		ApplicationContext context ;
		context = SpringApplication.run(OneToChoiceApplication.class);
		
		RoleRepository role ;
		role = context.getBean(RoleRepository.class);
		
		EmpRepository emp ;
		emp = context.getBean(EmpRepository.class);
	

		do {
			
			System.out.println(" 1.Save Record 2.Select Record 3.Update Record 4.Delete Record 5.Exit");
					
		   System.out.print("Enter your Choice : ");
		   Scanner sc = new Scanner(System.in);
		   int choice = sc.nextInt();
		   
		   
		   
		   if(choice == 1)
		   {
		   System.out.println("Enter Role ID :");
		   Scanner a= new Scanner(System.in);
		   int role_id = a.nextInt();
		   System.out.println("Enter Role  :");
		   String role_name = a.next();
		   
		   Role r1 = new Role(role_id,role_name);
			   role.save(r1);
			   
			   System.out.println("Enter Employee ID :");
			  
			   int emp_id = a.nextInt();
			   System.out.println("Enter Employee Name  :");
			   String name = a.next();
			   
			   Emp e1 = new Emp(emp_id,name,r1);
			   emp.save(e1);
			   
			   System.out.println(" Record Saved !");
			   System.out.println(" All Is Good !");
				   
					   
			  
			   
			   
		   }else if(choice == 2)
		   {
		   
			   List<Emp> list;
			   list = emp.findAll();
			   
			   System.out.println("Role ID " +" : "+"Employe Name"+" : "+"Employee Id");
			
		for(Emp e : list)
			{			
    		System.out.println(e.getRoleobj().getRole_id()+"  : "+e.getName()+"  : "+e.getEmp_id());      		
      		System.out.println("Record Select !");
      		System.out.println(" All Is Good !");
			
					
			}
			   
		   }else if(choice == 3)
		   {
			   Optional<Emp> op;
 				op = emp.findById(100);
      			Emp e1 = op.get();
      			System.out.println(e1.getEmp_id());
            	System.out.println(e1.getName());
            	System.out.println("Enter Updated Name : ");
            	String UName = sc.next();
		    	e1.setName(UName);
			    emp.save(e1);
			    	
			    	System.out.println(" Record Update  !");
			    	System.out.println(" All Is Good !");
			    	
		   }else if(choice == 4)
		   {
			
//			   Optional<Role> op1;
//				op1 = role.findById(100);
//				Role r1 = op1.get();
//				System.out.println(r1.getRole_desc());
//				role.delete(r1);
//				
      		System.out.println("Record Delete ");
      		System.out.println(" All Is Good !");
		   
		   }else if(choice == 5)
		   {
			  System.exit(0); 
		   }
							
			
		}while(true);
		
	}

}
