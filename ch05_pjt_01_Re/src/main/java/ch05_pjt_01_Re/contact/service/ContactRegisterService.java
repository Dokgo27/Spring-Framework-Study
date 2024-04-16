package ch05_pjt_01_Re.contact.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ch05_pjt_01_Re.contact.ContactSet;
import ch05_pjt_01_Re.contact.dao.ContactDao;

public class ContactRegisterService {

//	@Autowired
//	@Qualifier("usedDao")
//	private ContactDao contactDao;
	
//	@Resource
//	@Qualifier("mydao")
//	private ContactDao contactDao;
	
	@Autowired(required = false)
	public ContactDao contactDao;
	
//	@Resource
//	public ContactDao contactDao;


//	public ContactRegisterService() {
//		System.out.println("ContactRegisterService 기본생성자"); 
//	}

//	public ContactRegisterService(ContactDao contactDao) { 
//		this.contactDao = contactDao; 
//	}


	public void register(ContactSet contactSet) {
		String name = contactSet.getName();
		if (verify(name)) {
			contactDao.insert(contactSet);
		} else {
			System.out.println("The name has already registered.");
		}
	}

	public boolean verify(String name) {
		ContactSet contactSet = contactDao.select(name);
		return contactSet == null ? true : false;
	}

	/*
	 * public void setWordDao(ContactDao contactDao) { this.contactDao = contactDao;
	 * }
	 */

}
