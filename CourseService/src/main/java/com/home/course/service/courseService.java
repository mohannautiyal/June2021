package com.home.course.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.course.dao.courseDao;
import com.home.course.entities.Course;

@Service
public class courseService {

	List<Course> courses;

	@Autowired
	courseDao courseDao;
	
	courseService() {

		courses = new ArrayList<Course>();
		courses.add(new Course(1, "Mathemathics", 2000, "Two Months"));
		courses.add(new Course(2, "English", 1500, "One Months"));
	}

	public List<Course> getAllCourses() {
		 courses =courseDao.getAllCourses();
		return courses;
	}

	public Optional<Course> getCourseById(int id) {
		/*
		 * Course course; try { course = courses.get(id); } catch (Exception ex) {
		 * return null; }
		 */
		return courseDao.getCourseById(id);

	}

	public String addCourse(Course course) {
		//courses.add(course);
		courseDao.saveCourse(course);
		return "Course Added Successfully";
	}

	public Course getCourseByName(String courseName) {

		for (Course course : courses) {
			if (course.getCourseName().equals(courseName))
				return course;
		}
		return null;
	}

	public String deleteCourseById(int id) {
		System.out.println("Inside delete service");
		int indx =0;
		for (Course course : courses) {
			 indx ++;
			if (course.getId() == id) {

				courses.remove(indx);
				return "Course Deleted Successfully";
			}

		}
		return "Invalid course ID";
	}

}
