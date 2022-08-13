package com.xworkz.ConventinalHall.runner;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.coventinalHall.entity.ConventinalHallEntity;
import com.xworkz.dao.ConventinalHallDAO;
import com.xworkz.dao.ConventinalHallDAOImpl;



public class ConventinalHallRunner {

	public static void main(String[] args) {
		ConventinalHallEntity entity =new  ConventinalHallEntity();
		entity.setId(2);
		entity.setName("daimond hall");
		entity.setLoaction("Jpnagar");
		entity.setOwner("chandru");
		entity.setPrice(25000.0);
		entity.setCheckInTime(LocalTime.of(10, 00));
		entity.setCheckOutTime(LocalTime.of(9, 00));
		entity.setCheckInDate(LocalDate.of(2022, 07, 21));
		entity.setCheckOutDate(LocalDate.of(2022, 07, 24));
		
		
		ConventinalHallDAO dao = new ConventinalHallDAOImpl();
//		boolean b =dao.save(entity);
//		System.out.println("Data saved :"+b);
//		System.out.println("---------------------------------------------");
//		

		ConventinalHallEntity entity1= dao.findBYId(1);
		System.out.println(entity1);
		System.out.println("-----------------------------------");
		
		dao.updateNameAndOwnerById("Paradise Conventinal hall", "swamy", 1);
		
		dao.deleteById(2);
		
	}



	}


