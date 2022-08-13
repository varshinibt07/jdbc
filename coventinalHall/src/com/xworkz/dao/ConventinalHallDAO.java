package com.xworkz.dao;

import com.xworkz.coventinalHall.entity.ConventinalHallEntity;

public interface ConventinalHallDAO {
boolean save(ConventinalHallEntity entity);
	
ConventinalHallEntity findBYId(int id);
	
	void updateNameAndOwnerById(String newName,String newOwner,int id);
	
	void deleteById(int id);


}
