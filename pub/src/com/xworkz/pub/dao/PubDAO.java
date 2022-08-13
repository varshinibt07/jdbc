package com.xworkz.pub.dao;

import com.xworkz.pub.entity.PubEntity;

public interface PubDAO {
	boolean save(PubEntity entity);
	
	PubEntity findBYId(int id);
	
	void updateNameAndOwnerById(String newName,String newOwner,int id);
	
	void deleteById(int id);

}
