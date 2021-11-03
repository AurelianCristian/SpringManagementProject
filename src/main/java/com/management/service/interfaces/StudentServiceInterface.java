package com.management.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.management.entity.Student;

@Service
public interface StudentServiceInterface {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
	
	
}
