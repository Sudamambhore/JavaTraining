package com.example.LoginPage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

 
@Controller
public class MyController {
	@Autowired
	UserRepository userrepo;

	@PostMapping("/registeruser")
	public String registerUser(@ModelAttribute User user) {
		userrepo.save(user);
		return "Index";
	}

	@PostMapping("/check")
	public String loginUser(@ModelAttribute User user) {

		String path="invalid";
		List<User> list1 = userrepo.findAll();
		String uname=user.getUser_Name();
		String pass=user.getUser_Pass();
		for (User ob : list1) {
			if(ob.getUser_Name().equals(uname) && ob.getUser_Pass().equals(pass)) {
				path="result";
				break;
			}
		}

		return path;
	}

	@GetMapping("/newuser")
	public String goToRegister() {
		return "Register";
	}

}


