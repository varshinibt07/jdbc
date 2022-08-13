package com.xworkz.oyo.runner;

import java.time.LocalTime;

import com.xworkz.dao.OyoDAO;
import com.xworkz.dao.OyoDAOImpl;
import com.xworkz.oyo.entity.OyoEntity;

public class OyoRunner {

	public static void main(String[] args) {
		OyoEntity entity =new  OyoEntity();
		entity.setId(2);
		entity.setName("GKS RESIDENCY");
		entity.setLoaction("BTM Layout");
		entity.setOwner("Arjun");
		entity.setPrice(2000.0);
		entity.setCheckInTime(LocalTime.of(10, 00));
		entity.setCheckOutTime(LocalTime.of(9, 00));
		entity.setCreatedBy("lalith");
		entity.setUpdatedBy("likith");
		
		OyoDAO dao = new OyoDAOImpl();
//		boolean b =dao.save(entity);
//		System.out.println("Data saved :"+b);
//		System.out.println("---------------------------------------------");
//		

		OyoEntity entity1= dao.findBYId(1);
		System.out.println(entity1);
		System.out.println("-----------------------------------");
		
		dao.updateNameAndOwnerById("vijay resodency", "harsha", 1);
		
		dao.deleteById(2);
		
	}


}
