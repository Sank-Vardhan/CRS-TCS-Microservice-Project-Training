package com.tcs.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tcs.bean.Course;
import com.tcs.bean.Professor;
import com.tcs.bean.Student;

@Repository
public class ProfessorDAOImp implements ProfessorDAOInterface {
	private static List<Professor> professors;
	{
		professors = new ArrayList<Professor>();
		professors.add(new Professor(1431, "dean CSE","Information Technology"));
		professors.add(new Professor(1441, "CSE","Computer Science"));
		professors.add(new Professor(1451, "MECH","Mechanical"));
	}
	
	
	@Override
	public Professor create(Professor professor)
	{
		professor.setProfessorID(1149);
		professors.add(professor);
		return professor;
	}

	
	public Professor delete(int id) {
		
		return null;
	}

	@Override
	public List<Course> getCoursesByProfessor(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getEnrolledStudents(String profId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addGrade(int studentId, String courseCode, String grade) {
		// TODO Auto-generated method stub
		return null;
	}
}
