package onetoonejm2.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonejm2.dao.AadharCardDao;
import onetoonejm2.dao.PersonDao;
import onetoonejm2.dto.AadharCard;
import onetoonejm2.dto.Person;

public class PersonAdharCardController {
public static void main(String[] args) {
	
	Person person=new Person();
	person.setId(30);
	person.setName("sonali");
	person.setAddress("bangalore");
	
	AadharCard aadharCard=new AadharCard();
	aadharCard.setId(30);
	aadharCard.setName("aman");
	aadharCard.setAge(18);
	
	
	person.setAadharCard(aadharCard);
	PersonDao personDao=new PersonDao();
	AadharCardDao aadharCardDao=new  AadharCardDao();
	
	
	aadharCardDao.saveAadhar(aadharCard);
	personDao.savePerson(person);
	
	
	
	
}
}
