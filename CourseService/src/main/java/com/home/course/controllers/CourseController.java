package com.home.course.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.course.entities.Course;
import com.home.course.service.courseService;

@RestController
@RequestMapping("/CourseService")
public class CourseController {
	
	@Autowired
	courseService courseService;

	@GetMapping("/getcourses")
	public List<Course> getCourses() {
		List<Course> courses =courseService.getAllCourses();
		return courses;
	}
	
	
	
	@GetMapping("/Home")
	public String serviceHome() {
		return "Welcome to Course Service";
	}
	
	
	@GetMapping("/getCourseById/{id}")
	public Course getCourseById(@PathVariable  int id) {
		return 		courseService.getCourseById(id-1);

	}
	
	
	@PostMapping("/addCourse")
	public String addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
		
	}
	
}
