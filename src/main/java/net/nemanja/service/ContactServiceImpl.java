package net.nemanja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.nemanja.dao.ContactDAO;
import net.nemanja.model.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDAO contactDAO;

	@Transactional
	public void addContact(Contact contact) {
		contactDAO.addContact(contact);
	}

	@Transactional
	public List<Contact> listContacts() {
		return contactDAO.listContacts();
	}

	@Transactional
	public void deleteContact(Integer id) {
		contactDAO.deleteContact(id);
	}

}
