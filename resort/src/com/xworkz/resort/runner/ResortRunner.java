package com.xworkz.resort.runner;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.entity.ResortEntity;

public class ResortRunner {

	public static void main(String[] args) {
		ResortEntity resortentity = new ResortEntity();
		resortentity.setId(1);
		resortentity.setName("Mango Mist");
		resortentity.setLocation("Kanakapura Road");
		resortentity.setOwner("Nandhish");
		resortentity.setCheckInTime(LocalTime.of(12, 00));
		resortentity.setCheckOutTime(LocalTime.of(11, 00));
		resortentity.setCreateBy("om");
		resortentity.setCreateDate(LocalDate.now());
		resortentity.setUpdateDate(LocalDate.now());
		resortentity.setPricePerDay(2000D);
		//Create dao
		ResortDAO dao = new ResortDAOImpl();
		boolean saved = dao.save(resortentity);
		System.out.println("Saved :"+saved);
		
	}

}
