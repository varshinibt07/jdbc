package com.xworkz.java.array_as_dao.service;

import com.xworkz.java.array_as_dao.dao.StudentDAO;
import com.xworkz.java.array_as_dao.dao.StudentDAOImpl;
import com.xworkz.java.array_as_dao.dto.StudentDTO;
public class StudentServiceImpl implements StudentService{
	StudentDAO studentDAO = new StudentDAOImpl();

	@Override
	public void addStudent(StudentDTO dto) {
		long number = 9538687503l, reverse=0;
		
		while(number==0) {
			int remainder =  (int) (number%10);
			reverse=reverse*10+remainder;
			
		}
		if(dto.getPhno()==10) {
			studentDAO.addstudent(dto);
		}
		else {
			System.out.println("invalid phone number");
		}
		}

	@Override
	public StudentDTO getStudent(long phNo) {
	
		return studentDAO.getstudent(phNo);
	}

	@Override
	public void updatestudent(StudentDTO dto) {
		
		
	}

	

}

