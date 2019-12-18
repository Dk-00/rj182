package com.jhart;

public class Course {
	String course_id;
	String couese_name;
	String course_book;
	
	public Course() {
		super();
		// TODO 自动生成的构造函数存根
	}//无源码
	public Course(String couese_name, String course_book) {
		super();
		this.couese_name = couese_name;
		this.course_book = course_book;
	}//有源码
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getCouese_name() {
		return couese_name;
	}
	public void setCouese_name(String couese_name) {
		this.couese_name = couese_name;
	}
	public String getCourse_book() {
		return course_book;
	}
	public void setCourse_book(String course_book) {
		this.course_book = course_book;
	}
}
