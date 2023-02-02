package com.qspider.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qspider.hibernate.dto.StudentDTO;


public class StudentDAODelete {
	
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("student");

		EntityManager entityManager = 
				entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = 
				entityManager.getTransaction();

		entityTransaction.begin();

		StudentDTO student = 
				entityManager.find(StudentDTO.class, 1);
		
		entityManager.remove(student);

		entityTransaction.commit();

		entityManagerFactory.close();
		entityManager.close();

	}

}