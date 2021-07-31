package com.home.course.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.home.course.entities.Course;

@Service
public class courseService {
	
	List<Course> courses;
	
	courseService(){
		
		courses = new ArrayList<Course>();
		courses.add(new Course(1,"Mathemathics",2000,"Two Months"));
		courses.add(new Course(2,"English",1500,"One Months"));
	}
	
	public List<Course> getAllCourses() {		
		return courses;
	}

	
	public Course getCourseById(int id) {
		Course course;
		try {
        course = courses.get(id);
		}
		catch(Exception ex) {
			return null;
		}
		return course;
		
	}
	
	
	public String addCourse(Course course) {
		courses.add(course);
		return "Course Added Successfully";
	}

}
