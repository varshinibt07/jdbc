package com.xworkz.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.coventinalHall.entity.ConventinalHallEntity;


public class ConventinalHallDAOImpl implements ConventinalHallDAO {
	EntityManagerFactory factory =Persistence.createEntityManagerFactory("com.xworkz");
    EntityManager  manager = null;

	@Override
	public boolean save(ConventinalHallEntity entity) {
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
	public ConventinalHallEntity findBYId(int id) {
		try {
			manager = factory.createEntityManager();
			ConventinalHallEntity entity =manager.find(ConventinalHallEntity.class, id);
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
			ConventinalHallEntity entity =manager.find(ConventinalHallEntity.class, id);
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
			ConventinalHallEntity entity = manager.find(ConventinalHallEntity.class, id);
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
	


