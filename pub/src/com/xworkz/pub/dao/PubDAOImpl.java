package com.xworkz.pub.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.pub.entity.PubEntity;

public class PubDAOImpl implements PubDAO {
	EntityManagerFactory factory =Persistence.createEntityManagerFactory("com.xworkz");
     EntityManager  manager = null;
	@Override
	public boolean save(PubEntity entity) {
		
		try {
			 manager =factory.createEntityManager();
			EntityTransaction tx =manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();	
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		finally {
			manager.close();
			factory.close();
				
		}
		return true;
	}

	@Override
	public PubEntity findBYId(int id) {
	
		try {
			manager = factory.createEntityManager();
			PubEntity entity =manager.find(PubEntity.class, id);
			System.out.println("Hibernate Query :"+id);
			if(entity!=null) {
				System.out.println("findById Data found : "+entity);
				return entity;
			}
			else {
				System.out.println("Data Not Found");
			}
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			manager.close();
			
		}
		return null;
	}

	@Override
	public void updateNameAndOwnerById(String newName, String newOwner, int id) {
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			PubEntity entity =manager.find(PubEntity.class, id);
			entity.setName(newName);
			entity.setOwner(newOwner);
			manager.merge(entity);
			tx.commit();
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
		finally {
			manager.close();
			
		}
		
	}

	@Override
	public void deleteById(int id) {
		try {
			manager=factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			PubEntity entity = manager.find(PubEntity.class, id);
			manager.remove(entity);
			tx.commit();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		finally {
			manager.close();
			
		}
		
		
	}

}
