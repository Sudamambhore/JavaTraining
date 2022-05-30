package com.example.WebApplication_Link;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
		
@GetMapping("/main")
public String goToMain(@RequestParam String uname,HttpSession session) {
	session.setAttribute("fname", uname);
	return "main";
}
@GetMapping("/Movie")
public String goToMovie(HttpSession session) {
	String n=(String)session.getAttribute("fname");
	System.out.println("Name of USer "+n);
	return "Movie";
}
@GetMapping("/Sport")
public String goTosport() {
	return "Sport";
}

}