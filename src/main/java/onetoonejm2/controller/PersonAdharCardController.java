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
	PersonDao personDao=new PersonDao();
	AadharCardDao aadharCardDao=new  AadharCardDao();
	
//	SAVE
	
//	Person person=new Person();
//	person.setId(30);
//	person.setName("sonali");
//	person.setAddress("bangalore");
//	
//	AadharCard aadharCard=new AadharCard();
//	aadharCard.setId(30);
//	aadharCard.setName("aman");
//	aadharCard.setAge(18);
//	
//	
//	person.setAadharCard(aadharCard);
//	
//	
//	
//	aadharCardDao.saveAadhar(aadharCard);
//	personDao.savePerson(person);
	
//	SELECT
	
//	personDao.findPersonById(1);
//	aadharCardDao.findAadharById(1);
	
//	Delete
	
//	aadharCardDao.deleteAdharCard(1);
//	personDao.deletePerson(1);
	
	
	
//	aadharCardDao.updateAdhar(2, aadharCard);
	
	Person person=new Person();
	person.setName("sonliiiiiiiiiiiii");
	person.setAddress("mysoreeeeeeeee");
	
	
	personDao.updatePerson(30, person);
	
	
	
	
	
	
	
	
	
	
}
}
