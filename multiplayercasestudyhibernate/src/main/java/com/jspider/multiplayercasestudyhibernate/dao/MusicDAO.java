package com.jspider.multiplayercasestudyhibernate.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.multiplayercasestudyhibernate.dto.SongsDTO;

public class MusicDAO {
    
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static boolean loop = true;
	private static int choice;
	private static Scanner scanner = new Scanner(System.in);
	private static SongsDTO Operations=new SongsDTO();
	
	public static void openConnection() {
		factory= Persistence.createEntityManagerFactory("Music");
		manager=factory.createEntityManager();
		transaction=manager.getTransaction();
	}
	
	public static void closeConnection() {
		if(factory != null) {
			factory.close();
		}
		if(manager != null) {
			manager.close();
		}
		if(transaction.isActive()) {
			transaction.rollback();
		}
	}
	
public static void main(String[] args) {
		openConnection();
		transaction.begin();
		
		musicPlayer();
		
	}
	
	private static void musicPlayer() {
		
		while (loop) {
			System.out.println("==========MENU==========");
			System.out.println("1. Add/Remove Song\n"
					+ "2. Play Song\n"
					+ "3. Edit Song\n"
					+ "4. Exit");
			
			choice = scanner.nextInt();
			
			switch (choice) {
			
			case 1:
				System.out.println("==========MENU==========");
				System.out.println("1. Add a Song\n"
						+ "2. Remove a song\n"
						+ "3. Go Back");
				
				choice = scanner.nextInt();
				
				switch (choice) {
				case 1:
					Operations.addSongs();
					
					break;

				case 2:
					Operations.removeSongs();
					break;
					
				case 3:
					musicPlayer();
					break;
					
				default:
					System.out.println("Invalid choice. Try again...!!!");
					break;
				}
				
				break;
			
			case 2:
				System.out.println("==========MENU==========");
				System.out.println("1. Play all songs\n"
						+ "2. Select a song\n"
						+ "3. Play random song\n"
						+ "4. Go Back");
				
				choice = scanner.nextInt();
				
				switch (choice) {
				case 1:
					
					break;

				case 2:
					
					break;
					
				case 3:
					
					break;
					
				case 4:
					musicPlayer();
					manager.persist(Operations);
					break;
					
				default:
					break;
				}
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				System.out.println("Thank you...!!!");
				loop = false;
				break;
				
			default:
				System.out.println("Invalid choice. Try again...!!!");
				break;
			}
		}
		transaction.commit();
		closeConnection();
	}
}
