package com.management.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.management.entity.Course;
import com.management.repository.CourseRepository;
import com.management.service.interfaces.CourseServiceInterface;
@Service
public class CourseServiceImpl implements CourseServiceInterface {
	private CourseRepository courseRepository;

	public CourseServiceImpl(CourseRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	}

	@Override
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

	@Override
	public Course saveCourse(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public Course getCourseById(Long id) {
		return courseRepository.findById(id).get();
	}

	@Override
	public Course updateCourse(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public void deleteCourseById(Long id) {
		courseRepository.deleteById(id);

	}

}
