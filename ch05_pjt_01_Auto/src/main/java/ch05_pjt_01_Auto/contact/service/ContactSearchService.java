package ch05_pjt_01_Auto.contact.service;

import org.springframework.beans.factory.annotation.Autowired;

import ch05_pjt_01_Auto.contact.ContactSet;
import ch05_pjt_01_Auto.contact.dao.ContactDao;

public class ContactSearchService {
	
	@Autowired
	private ContactDao contactDao;
	
	/*
	 * public ContactSearchService() {
	 * System.out.println("ContactSearchService 기본생성자"); }
	 */
	
	
	/*
	 * public ContactSearchService(ContactDao contactDao) { this.contactDao =
	 * contactDao; }
	 */
	
	public ContactSet searchContact(String name) {
		if(verify(name)) {
			return contactDao.select(name);
		}
		else {
			System.out.println("Contact infomation is available.");
		}
		return null;
	}
	
	public boolean verify(String name) {
		ContactSet contactSet = contactDao.select(name);
		return contactSet != null ? true : false;
	}
	
	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}
	
	

}
