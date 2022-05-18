package com.example.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentDetails {
//private Student stud;
//	
//	@Autowired
//	public StudentDetails(Student stud) {
//		this.stud=stud;
//	}
//	
//	void setdata() {
//		stud.setId(100);
//		stud.setName("abc");
//	}
//	void shodata() {
//		System.out.println(stud.getId());
//		System.out.println(stud.getName());
	
	
	private Student stud;
	
	 
	public Student getStud() {
		return stud;
	}
	@Autowired
	public void setStud(Student stud) {
		this.stud = stud;
	}
	void setdata() {
		stud.setId(800);
		stud.setName("qwe");
	}
	void shodata() {
		System.out.println(stud.getId());
		System.out.println(stud.getName());


	}
}
