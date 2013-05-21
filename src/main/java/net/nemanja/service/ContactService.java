package net.nemanja.service;

import java.util.List;

import net.nemanja.model.Contact;

public interface ContactService {

	public void addContact(Contact contact);
	public List<Contact> listContacts();
	public void deleteContact(Integer id);

}
