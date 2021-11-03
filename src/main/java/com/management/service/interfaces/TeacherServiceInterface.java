package com.management.service.interfaces;

import java.util.List;

import com.management.entity.Teacher;

public interface TeacherServiceInterface {
	List<Teacher> getAllTeachers();

	Teacher saveTeacher(Teacher teacher);

	Teacher getTeacherById(Long id);

	Teacher updateTeacher(Teacher teacher);

	void deleteTeacherById(Long id);
}
