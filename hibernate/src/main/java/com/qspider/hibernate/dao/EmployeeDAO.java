package com.qspider.hibernate.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qspider.hibernate.dto.EmployeeDTO;


public class EmployeeDAO {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	private static void openConnection() {
		factory = Persistence.
				createEntityManagerFactory("Annotations");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}

	private static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		if (transaction.isActive()) {
			transaction.rollback();
		}
	}
	
	public static void main(String[] args) {
		
		openConnection();
		transaction.begin();
		
		EmployeeDTO employee1 = new EmployeeDTO();
		employee1.setName("Jaadu");
		employee1.setEmail("jaadu@koimilgaya.com");
		employee1.setDesignation("alien");
		employee1.setSalary(10000);
		manager.persist(employee1);
		
		EmployeeDTO emp2= new EmployeeDTO();
		emp2.setName("Bunny");
		emp2.setEmail("bunny@yjhd.com");
		emp2.setDesignation("Traveller");
		emp2.setSalary(20000);
		manager.persist(emp2);
		
		transaction.commit();
		closeConnection();
		
	}

}