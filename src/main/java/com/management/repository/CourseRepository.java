package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
