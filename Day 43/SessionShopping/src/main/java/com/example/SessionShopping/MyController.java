package com.example.SessionShopping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {
	@GetMapping("/main")
	public String MainPage(@RequestParam String uname, Model model) {
		model.addAttribute("uname", uname);
		return "main";
	}
	
	@GetMapping("/main1")
	public String mainPage(@RequestParam (name = "uname",required = false, defaultValue = "DIEMS")String uname, Model model) {
		model.addAttribute("uname", uname);
	return "main1";
	} 
	
	@GetMapping("/")
	public String home() {
		return "Index";			
	}
		
	@GetMapping("/Total")
	public String createShooping (@ModelAttribute Shooping shooping) {		
		return "Total";
	}
		
}
