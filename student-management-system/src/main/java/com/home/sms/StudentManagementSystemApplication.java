package com.home.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.home.sms.entity.Student;
import com.home.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student = new Student("Raj","Kumar","Raj.Kumar@gmail.com");
		 * studentRepository.save(student); student = new
		 * Student("Karan","Singh","Karan.Singh@gmail.com");
		 * studentRepository.save(student);
		 */
	}

}
