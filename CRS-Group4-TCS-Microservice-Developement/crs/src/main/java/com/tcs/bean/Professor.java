package com.tcs.bean;

public class Professor {
	
	private int professorID;
	private String designation;
	private String course;

	public Professor(int professorID,String designation,String course) {
		super();
		this.professorID = professorID;
		this.designation = designation;
		this.course = course;
	}
	public int getProfessorID() {
		return professorID;
	}
	public void setProfessorID(int professorID) {
		this.professorID = professorID;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}