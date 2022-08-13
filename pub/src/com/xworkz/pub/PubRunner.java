package com.xworkz.pub;

import java.time.LocalDate;

import com.xworkz.pub.dao.PubDAO;
import com.xworkz.pub.dao.PubDAOImpl;
import com.xworkz.pub.entity.PubEntity;

public class PubRunner {

	public static void main(String[] args) {
		PubEntity entity = new PubEntity();
		entity.setId(3);
		entity.setName("Tipsy Bull");
		entity.setLocation("jpnagar");
		entity.setOwner("Bharath");
		entity.setPricePerDay(2550.00);
		entity.setCreatedBy("Varsh");
		entity.setCreatedDate(LocalDate.of(2022, 05, 23));
		entity.setUpdatedBy("Gaggu");
		entity.setUpdatedDate(LocalDate.of(2022, 06, 24));
		
		PubDAO dao = new PubDAOImpl();
//		boolean b =dao.save(entity);
//		System.out.println("Data saved :"+b);
//		System.out.println("---------------------------------------------");
//		

		PubEntity entity1= dao.findBYId(1);
		System.out.println(entity1);
		System.out.println("-----------------------------------");
		
		dao.updateNameAndOwnerById("Stories", "Nandesh", 2);
		
		dao.deleteById(3);
	}

}
