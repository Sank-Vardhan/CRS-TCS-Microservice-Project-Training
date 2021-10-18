package com.tcs.dao;

import com.tcs.bean.Course;
import com.tcs.bean.Professor;
import com.tcs.bean.User;

public interface AdminDAOInterface {
	public void deleteCourse(String courseCode);
	public void addCourse(Course course);
	public void approveStudent(int StudentId);
	public void addProfessor(Professor professor);
	public void addUser(User user);

}
