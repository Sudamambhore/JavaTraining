package com.example.HtmlTags;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
	

//		@GetMapping("/sayhello")
//		public String greeting(@RequestParam(name = "uname",required = false, defaultValue = "DIEMS")String fname, @RequestParam(name = "upass",required = false, defaultValue = "DIEMS")String upass, Model model) {
//			
//			model.addAttribute("uname",fname);
//			model.addAttribute("upass",upass);		
//			return "hello";
	
		@GetMapping("/")
		public String home() {
			return "index";			
		}
		
		@PostMapping("/createstudent")
		public String createStudent(@ModelAttribute Student student) {
			return "hello";
		}
		

}
