package com.home.course;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.home.course.dao.courseDao;
import com.home.course.entities.Course;
import com.home.course.service.courseService;

@SpringBootTest(classes= {CourseServiceApplicationTests.class})
class CourseServiceApplicationTests {

	@InjectMocks
	courseService courseService;
	
	@Mock
	courseDao courseDao;
	
	
	@Test
	public void testGetAllCourses() {
		
		List<Course> courses = new ArrayList<Course>();
		courses.add(new Course(1,"Maths",2000,"1 Month"));
		courses.add(new Course(2,"Science",3000,"3 Months"));

		when(courseDao.getAllCourses()).thenReturn(courses);
		List<Course> coursesActual =courseService.getAllCourses();
		System.out.println(coursesActual);
		/*
		 * if (coursesActual.equals(courses)) return true; else return false;
		 */
	}
}
