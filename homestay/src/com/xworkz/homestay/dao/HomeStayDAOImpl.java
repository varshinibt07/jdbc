package com.xworkz.homestay.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.homestay.entity.HomeStayEntity;


public class HomeStayDAOImpl implements HomeStayDAO{
	EntityManagerFactory factory =Persistence.createEntityManagerFactory("com.xworkz");
    EntityManager  manager = null;
	@Override
	public boolean save(HomeStayEntity entity) {
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
				
		}
		return true;
	}
	@Override
	public HomeStayEntity findById(int id) {
		try {
			manager = factory.createEntityManager();
			HomeStayEntity entity =manager.find(HomeStayEntity.class, id);
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
	public void updateNameAndLocationById(String newName, String newLocation, int id) {
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			HomeStayEntity entity =manager.find(HomeStayEntity.class, id);
			entity.setName(newName);
			entity.setLocation(newLocation);
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
			HomeStayEntity entity = manager.find(HomeStayEntity.class, id);
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


