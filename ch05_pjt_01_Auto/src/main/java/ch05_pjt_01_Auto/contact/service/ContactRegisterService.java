package ch05_pjt_01_Auto.contact.service;

import org.springframework.beans.factory.annotation.Autowired;

import ch05_pjt_01_Auto.contact.ContactSet;
import ch05_pjt_01_Auto.contact.dao.ContactDao;

public class ContactRegisterService {

	// 필드에 바로 그냥 오토와이어드 해버려
	@Autowired
	public ContactDao contactDao;

	
//	 public ContactRegisterService() {
//		 System.out.println("ContactRegisterService 기본생성자"); 
//	}
	 
//	@Autowired
//	public ContactRegisterService(ContactDao contactDao) { 
//		 this.contactDao = contactDao; 
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
