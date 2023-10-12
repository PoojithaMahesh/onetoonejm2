package onetoonejm2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonejm2.dto.AadharCard;
import onetoonejm2.dto.Person;


public class AadharCardDao {

	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
	}

	public void saveAadhar(AadharCard  aadharCard) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(aadharCard);
		entityTransaction.commit();
	}
	
	public void findAadharById(int id) {
		EntityManager entityManager=getEntityManager();
		AadharCard  aadharCard=entityManager.find(AadharCard.class, id);
		if(aadharCard!=null) {
//			id is presnt in the database
			System.out.println(aadharCard);
		}else {
//			id is not present
			System.out.println("Id is not present");
		}
	}
	
	
	public void updateAdhar(int id ,AadharCard aadharCard) {
		EntityManager entityManager=getEntityManager();
		AadharCard dbAadharCard =entityManager.find(AadharCard.class, id);
		
		if(dbAadharCard!=null) {
//			id is present and we can update the data
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			aadharCard.setId(id);
			entityManager.merge(aadharCard);
			entityTransaction.commit();
		
		}else {
//			id is not present
			System.out.println("Sorry id is not present to update the data");
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void deleteAdharCard(int id) {
		EntityManager entityManager=getEntityManager();
		AadharCard aadharCard=entityManager.find(AadharCard.class, id);
		if(aadharCard!=null) {
//			id is present so i can delete an adhar
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(aadharCard);
			entityTransaction.commit();
		}else {
//			id is not present
			System.out.println("Sorry id is not present");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
