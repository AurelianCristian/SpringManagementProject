package com.management.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String courseName;
private int duration;

public Course() {
}

public Course(String courseName, int duration) {
	super();
	this.courseName = courseName;
	this.duration = duration;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getCourseName() {
	return courseName;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public int getDuration() {
	return duration;
}

public void setDuration(int duration) {
	this.duration = duration;
}

}
