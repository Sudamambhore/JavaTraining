package com.example.Web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/")
	public String sayHello() {
		return "hello From Spring Boot";
	}
	@GetMapping("/hello")
	public String getMsg() {
		return "Hello Sudam";
	}

}
