package com.home.sms.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.home.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
