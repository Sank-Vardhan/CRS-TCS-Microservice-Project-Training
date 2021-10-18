package com.tcs.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.tcs.bean.Student;
import com.tcs.service.StudentServiceOperation;

public class StudentRestController {
	@Autowired //CustomerDAO customerDAOOperation = new CustomerDAO();
	private StudentServiceOperation students;
	
	@GetMapping("/students")
	public List getStudents() {
		return students.list();
	}

}
