package com.example.LoginPage;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int id;
	private String user_Name;
	private String user_Pass;
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_Name() {
		return user_Name;
	}


	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public String getUser_Pass() {
		return user_Pass;
	}

	public void setUser_Pass(String user_Pass) {
		this.user_Pass = user_Pass;
	}
	
	public User(int id, String user_Name, String user_Pass) {
		this.id = id;
		this.user_Name = user_Name;
		this.user_Pass = user_Pass;
	}



	public User() {
		
	}

}
