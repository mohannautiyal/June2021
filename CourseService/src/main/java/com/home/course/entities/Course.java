package com.home.course.entities;

import lombok.Data;

@Data
public class Course {
	
	
	private int id;
	private String courseName;
	private int coursePrice;
	private String courseDuration;
	
	public Course(int id, String courseName, int coursePrice, String courseDuration) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.courseDuration = courseDuration;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", coursePrice=" + coursePrice + ", courseDuration="
				+ courseDuration + "]";
	}
	
	
	
	
	
	
}
