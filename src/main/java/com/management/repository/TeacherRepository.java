package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long>{

}
