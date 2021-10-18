
package com.tcs.dao;

import java.util.List;

import com.tcs.bean.Course;
import com.tcs.bean.Professor;
import com.tcs.bean.Student;

public interface ProfessorDAOInterface {

	public List<Course> getCoursesByProfessor(String userId);
	public Professor create(Professor professor);
	public List<Student> getEnrolledStudents(String profId);
	public Boolean addGrade(int studentId,String courseCode,String grade);
	
}
