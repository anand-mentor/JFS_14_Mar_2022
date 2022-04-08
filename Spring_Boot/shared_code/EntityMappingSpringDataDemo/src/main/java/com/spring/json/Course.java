package com.spring.json;

public class Course {

	private long courseId;
	private String courseName;

	public Course() {}
	
	public Course(long courseId, String courseName) {
		this.courseId = courseId;
		this.courseName = courseName;
	}

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public long getCourseId() {
		return this.courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}