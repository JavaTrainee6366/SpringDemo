package com.example.SpringDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDemo.service.CourseService;
import com.example.SpringDemo.service.CourseServiceImpl;
import com.example.SpringDemo.entity.Course;

@RestController
public class MyController {
	@Autowired
	private CourseService obj ;
	
	
	@GetMapping("/home")
	public String home() {
		
		return "Welcome HOme ";
		
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.obj.getCourses();
		
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		
		return this.obj.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/addCourse")
	public String addCourse(@RequestBody Course course) {
		
		this.obj.addCourse(course);
		return "Successfully Inserted";
	}

	@DeleteMapping("/courses/{courseId}") 
	public String delCourse(@PathVariable String courseId){
	  
	
		  this.obj.delCourse(Long.parseLong(courseId)); 
		  return "Deleted Successfully";
	}	
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {

		return this.obj.updateCourse(course);
	}
	
}
