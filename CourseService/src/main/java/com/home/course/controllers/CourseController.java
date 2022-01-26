package com.home.course.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public Optional<Course> getCourseById(@PathVariable  int id) {
		return 		courseService.getCourseById(id);

	}
	
	
	
	@PostMapping("/addCourse")
	public String addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
		
	}
	
	@GetMapping("/getCourseByName")
	public Course getCourseByName(@RequestParam  String courseName) {
		return 		courseService.getCourseByName(courseName);

	}
	
	@DeleteMapping("/deleteCourseById/{id}")
	public String deleteCourse(@PathVariable int id) {
		System.out.println("Inside Delete Controller");
		return courseService.deleteCourseById(id);
	}
	
}
