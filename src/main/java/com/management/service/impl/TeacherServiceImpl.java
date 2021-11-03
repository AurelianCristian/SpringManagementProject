package com.management.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.management.entity.Teacher;
import com.management.repository.TeacherRepository;
import com.management.service.interfaces.TeacherServiceInterface;


@Service
public class TeacherServiceImpl implements TeacherServiceInterface {

	private TeacherRepository teacherRepoistory;

	public TeacherServiceImpl(TeacherRepository teacherRepoistory) {
		super();
		this.teacherRepoistory = teacherRepoistory;
	}

	@Override
	public List<Teacher> getAllTeachers() {
		return teacherRepoistory.findAll();
	}

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		return teacherRepoistory.save(teacher);
	}

	@Override
	public Teacher getTeacherById(Long id) {
		return teacherRepoistory.findById(id).get();
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		return teacherRepoistory.save(teacher);
	}

	@Override
	public void deleteTeacherById(Long id) {
		teacherRepoistory.deleteById(id);

	}

}
