package com.management.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.management.entity.Course;

@Service
public interface CourseServiceInterface {
	List<Course> getAllCourses();

	Course saveCourse(Course course);

	Course getCourseById(Long id);

	Course updateCourse(Course course);

	void deleteCourseById(Long id);

}
