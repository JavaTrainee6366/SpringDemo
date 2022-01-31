package com.example.SpringDemo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDemo.service.CourseService;
import com.example.SpringDemo.entity.Course;

@RestController
public class MyController {
	
	private CourseService obj ;

	@GetMapping("/index")
	public String home() {
		
		int x = 10+20;
		
		return "Welcome HOme "+x;
		
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		
		return this.obj.getCourses();
			
		
	}
}
