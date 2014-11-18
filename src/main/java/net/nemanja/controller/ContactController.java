/*
 * Comment just to demonstrate pull request.
 */
package net.nemanja.controller;

import net.nemanja.model.Contact;
import net.nemanja.service.ContactService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "redirect:/index";
	}

	@RequestMapping(value = "/index")
	public ModelAndView listContacts() {

		ModelAndView mav = new ModelAndView("contact");

		mav.addObject("contact", new Contact());
		mav.addObject("contacts", contactService.listContacts());

		return mav;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contact") Contact contact,
			BindingResult result) {

		contactService.addContact(contact);

		return "redirect:/index";
	}

	@RequestMapping(value = "/delete/{contactId}")
	public String deleteContact(@PathVariable("contactId") Integer contactId) {

		contactService.deleteContact(contactId);

		return "redirect:/index";
	}
}
