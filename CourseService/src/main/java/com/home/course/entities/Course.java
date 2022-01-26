package com.home.course.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Course {

	
	Course(){
		
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;

	 @Column(name="course_name")
	private String courseName;
	 @Column(name="course_price")
	private int coursePrice;
    @Column(name="course_duration")
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
