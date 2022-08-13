package com.xworkz.runner;

import java.time.LocalTime;

import com.xworkz.bank.entity.BankEntity;
import com.xworkz.dao.BankDAO;
import com.xworkz.dao.BankDAOImpl;


public class BankRunner {

	public static void main(String[] args) {
		BankEntity entity =new BankEntity();
		entity.setId(2);
		entity.setName("HDFC");
		entity.setOwner("Lakshmi");
		entity.setLocation("sira");
		entity.setLogin(LocalTime.of(9, 00));
		entity.setLogout(LocalTime.of(5, 00));
		entity.setCreatedBy("Varsh");
		entity.setUpdatedBy("Nandeshh");
		
		BankDAO dao = new BankDAOImpl();
//		boolean b =dao.save(entity);
//		System.out.println("Data saved :"+b);
//		System.out.println("---------------------------------------------");
//		
		BankEntity entity1= dao.findById(1);
		System.out.println(entity1);
		System.out.println("-----------------------------------");
		
		dao.updateNameAndLocationById("SBI ", "mysore", 1);
	
		dao.deleteById(2);

		
	}

}
