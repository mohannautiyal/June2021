package com.home.sms.service;

import java.util.List;

import com.home.sms.entity.Student;

public interface StudentService {

	
	public List<Student> getAllStudents();
	
	public Student saveStudent(Student student);

	public void deleteStudentById(Long id);
}
