package com.xworkz.java.array_as_dao;

import com.xworkz.java.array_as_dao.dto.StudentDTO;
import com.xworkz.java.array_as_dao.service.StudentService;
import com.xworkz.java.array_as_dao.service.StudentServiceImpl;

public class ArrayApplication {
	public static void main(String[] args)
	{
		StudentDTO dto = new StudentDTO("1","varsh","BTM01",9113455644l,"70%");
		StudentService service = new StudentServiceImpl();
		
		service.addStudent(dto);
		
		StudentDTO student = service.getStudent(9113455644l);
		
		System.out.println("student details");
		System.out.println(student);
	}
}
