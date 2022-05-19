package com.example.EmployeeSpringBoot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int Emp_Id;
	@Column
	private String Emp_name;
	private String Emp_address;
	private String Emp_Mail;
	private int Emp_Number;
	private double salary;
	
	
	
	 public int getEmp_Id() {
		return Emp_Id;
	}



	public void setEmp_Id(int emp_Id) {
		Emp_Id = emp_Id;
	}



	public String getEmp_name() {
		return Emp_name;
	}



	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}



	public String getEmp_address() {
		return Emp_address;
	}



	public void setEmp_address(String emp_address) {
		Emp_address = emp_address;
	}



	public String getEmp_Mail() {
		return Emp_Mail;
	}



	public void setEmp_Mail(String emp_Mail) {
		Emp_Mail = emp_Mail;
	}



	public int getEmp_Number() {
		return Emp_Number;
	}



	public void setEmp_Number(int emp_Number) {
		Emp_Number = emp_Number;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public Employee() {

	    }



	public Employee(int emp_Id, String emp_name, String emp_address, String emp_Mail, int emp_Number, double salary) {
		super();
		Emp_Id = emp_Id;
		Emp_name = emp_name;
		Emp_address = emp_address;
		Emp_Mail = emp_Mail;
		Emp_Number = emp_Number;
		this.salary = salary;
	}
	
	
	 
	 
	
	

}
