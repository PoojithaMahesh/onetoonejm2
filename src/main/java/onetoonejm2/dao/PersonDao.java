package onetoonejm2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonejm2.dto.AadharCard;
import onetoonejm2.dto.Person;

public class PersonDao {
public EntityManager getEntityManager() {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	return entityManager;
}

public void savePerson(Person person) {
	EntityManager entityManager=getEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(person);
	entityTransaction.commit();
}

public void findPersonById(int id) {
	EntityManager entityManager=getEntityManager();
	Person  person=entityManager.find(Person.class, id);
	if(person!=null) {
//		id is presnt in the database
		System.out.println(person);
	}else {
//		id is not present
		System.out.println("Id is not present");
	}
}










public void deletePerson(int id) {
	EntityManager entityManager=getEntityManager();
	Person person=entityManager.find(Person.class, id);
	if(person!=null) {
//		id is present so i can delete an adhar
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(person);
		entityTransaction.commit();
	}else {
//		id is not present
		System.out.println("Sorry id is not present");
	}
}




public void updatePerson(int id ,Person person) {
	EntityManager entityManager=getEntityManager();
	Person dbPerson =entityManager.find(Person.class, id);
//	dpPerson===id name addres adhar
	if(dbPerson!=null) {
//		id is present and we can update the data
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		person.setId(id);
//		person=id name address aadharCard
		person.setAadharCard(dbPerson.getAadharCard());
//		person=id new name address but  old aadharcard
		entityManager.merge(person);
		entityTransaction.commit();
	
	}else {
//		id is not present
		System.out.println("Sorry id is not present to update the data");
	}
	






















}}
