package com.xworkz.java.array_as_dao.dao;

import com.xworkz.java.array_as_dao.dto.StudentDTO;

public interface StudentDAO {
	
	void addstudent(StudentDTO dto);
	StudentDTO getstudent(long phno);
	void updateStudent(StudentDTO dto);

}
