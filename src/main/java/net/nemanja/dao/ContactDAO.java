package net.nemanja.dao;

import java.util.List;

import net.nemanja.model.Contact;

public interface ContactDAO {

	public void addContact(Contact contact);
	public List<Contact> listContacts();
	public void deleteContact(Integer id);

}
