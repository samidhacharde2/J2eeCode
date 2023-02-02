package com.qspider.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qspider.hibernate.dto.StudentDTO;

public class StudentDAO {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("student");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		
		StudentDTO stuDto=new StudentDTO();
		stuDto.setId(1);
		stuDto.setName("Popatlal");
		stuDto.setEmail("popatlal@matrimony.com");
		stuDto.setContact(9551847665l);
		stuDto.setCity("Gokuldham");
		
		entityManager.persist(stuDto);
		
		entityManagerFactory.close();
		entityTransaction.commit();
		entityManager.close();
	}
}
