package com.xworkz.dao;

import com.xworkz.oyo.entity.OyoEntity;

public interface OyoDAO {
boolean save(OyoEntity entity);
	
	OyoEntity findBYId(int id);
	
	void updateNameAndOwnerById(String newName,String newOwner,int id);
	
	void deleteById(int id);


}
