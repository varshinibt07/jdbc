package com.xworkz.homestay.runner;

import java.time.LocalDate;


import com.xworkz.homestay.dao.HomeStayDAO;
import com.xworkz.homestay.dao.HomeStayDAOImpl;
import com.xworkz.homestay.entity.HomeStayEntity;


public class HomeStayRunner {

	public static void main(String[] args) {
			HomeStayEntity entity =new  HomeStayEntity();
			entity.setId(2);
			entity.setName("vijay HomeStay");
			entity.setLocation("Bangalore");
			entity.setOwner("Chandhu");
			entity.setPrice(3000.0);
			entity.setCreatedBy("Shyla");
			entity.setCreatedDate(LocalDate.of(2022, 07, 13));
			entity.setUpdatedBy("Bharath");
			entity.setUpdatedDate(LocalDate.of(2022, 07, 15));
			
			HomeStayDAO dao = new HomeStayDAOImpl();
//			boolean b =dao.save(entity);
//			System.out.println("Data saved :"+b);
			System.out.println("---------------------------------------------");
			
			HomeStayEntity entity1= dao.findById(1);
			System.out.println(entity1);
			System.out.println("-----------------------------------");
			
			dao.updateNameAndLocationById("Nisarga ", "mysore", 1);
			
			dao.deleteById(2);
			
			
	}

}
