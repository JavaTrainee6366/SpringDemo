package com.example.SpringDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.SpringDemo.entity.Course;
import com.example.SpringDemo.service.CourseService;
import com.example.SpringDemo.dao.CourseDao;

public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	public CourseServiceImpl() {
		// TODO Auto-generated constructor stub
		// DAO layer : will be used for database connectivity

		list = new ArrayList<Course>();

		list.add(new Course(202, "Android", "Android Course"));
		list.add(new Course(203, "Iphone", "Iphone Course"));
		list.add(new Course(204, "Python", "Python Course"));
		list.add(new Course(205, "Java", "Java Course"));
		list.add(new Course(206, "SQA", "SQA Course"));

	}

	public List<Course> getCourses() {
		// TODO Auto-generated method stub

		return list; // without database

		// return coursedao.findAll();
	}
}
