package com.xworkz.java.array_as_dao.dao;

import com.xworkz.java.array_as_dao.dto.StudentDTO;

public class StudentDAOImpl implements StudentDAO {
	StudentDTO[] students = new StudentDTO[10];

	@Override
	public void addstudent(StudentDTO dto) {
		students[0]=dto;
		
	}

	@Override
	public StudentDTO getstudent(long phno) {
		int index=-1;
		for(int i=0;i<students.length;i++) {
			if (students[i].getPhno()==phno) {
				index=i;
			
			}
		}
	   if(index==-1)
		   return null;
	   else
		   return students[index];
	}

	@Override
	public void updateStudent(StudentDTO dto) {
		
		
	}

}
