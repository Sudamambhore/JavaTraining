package com.example.MVCFunctions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyContoller {
	@GetMapping("/")
	public String home() {
		return "Index";
		
	}
	
	
	@PostMapping("/createstudent")
	public String createStudent (@ModelAttribute Student student) {
		
		return"result";
	}

}
