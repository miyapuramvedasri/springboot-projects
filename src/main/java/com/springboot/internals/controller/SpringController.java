package com.springboot.internals.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.internals.model.Student;


@RestController
public class SpringController {
    @GetMapping("/first")
	public String GetMessage() {
		return "welcome to springboot!";
	}
    
    @GetMapping("/student")
    public Student Display() {
    	return new Student("vedasri","miyapuram");
    	
    }
    
    @GetMapping("/list")
    public List<Student> getstudents(){
    	List<Student> s1=new ArrayList<>();
    	s1.add(new Student("vidya","sri"));
    	s1.add(new Student("divya","sri"));
    	return s1;
    }
}
