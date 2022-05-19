package com.example.EmployeeSpringBoot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
	private EmployeeRepository emp;
	@GetMapping("/students")
	public List<Employee> getAllStudents(){
//		List<Student> studlist;
//		studlist = stud.findAll();
//		return studlist;
//		return studlist;
		
		return emp.findAll();
		
	}
	//Find By ID
	
//	@GetMapping("/student/{id}")
//	public Employee getEmployeeById(@PathVariable("id") Integer empId) {
//		Optional<Employee> op = emp.findById(empId);
//	    Employee st = op.get();
//		return st;
//	}
	@GetMapping("/student/{id}")
	public Employee getStudentById(@PathVariable("id") Integer empId) {
		Optional<Employee> op = emp.findById(empId);
		Employee st = op.get();
	    return st;
	}

	@PostMapping("/save")
	public Employee createEmployee(@RequestBody Employee st) {
		return emp.save(st);
	}

	
	
	
	
}
