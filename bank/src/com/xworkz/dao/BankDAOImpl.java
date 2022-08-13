package com.xworkz.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.bank.entity.BankEntity;


public class BankDAOImpl implements BankDAO{
	EntityManagerFactory factory =Persistence.createEntityManagerFactory("com.xworkz");
    EntityManager  manager = null;


	@Override
	public boolean save(BankEntity entity) {
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
	public BankEntity findById(int id) {
		try {
			manager = factory.createEntityManager();
			BankEntity entity =manager.find(BankEntity.class, id);
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
			BankEntity entity =manager.find(BankEntity.class, id);
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
			BankEntity entity = manager.find(BankEntity.class, id);
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
	


