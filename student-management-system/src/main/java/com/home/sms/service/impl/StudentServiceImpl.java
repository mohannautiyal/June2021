package com.home.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.home.sms.entity.Student;
import com.home.sms.repository.StudentRepository;
import com.home.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	
	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}


	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);		
	}

}
