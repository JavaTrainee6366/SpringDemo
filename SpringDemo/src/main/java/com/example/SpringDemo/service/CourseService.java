package com.example.SpringDemo.service;

import java.util.List;

import com.example.SpringDemo.entity.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public void addCourse(Course course);
	public void delCourse(long courseId);
	public Course updateCourse(Course course);

}
