package com.mynetwork.mynetwork.network;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



/*
 * Controller allows the app to interact with the browser
 */

@Controller //Spring will consider this class when handling incoming web request
public class PersonController {
	private static List<String> connections;
	static {
		connections = new ArrayList<>();
		connections.add("College");
		connections.add("Codepath");
		connections.add("Colorstack");
		connections.add("Rewriting the Code");
		connections.add("High School");
	}
	@Autowired
	private PersonRepository personrepo;
	
	//Spring will come to this URL when at the root URl for our application
	//any HTTp request with / should be mapped to the home home method
	@GetMapping(value = "/")
	public String home() {
		return "pages/coverpage";
	}
	//The button is attached to a path/ that path is the value in the getMapping which calls newForm
	@GetMapping(value = "/pages/form")
	public String newform (Person person) {
	    return "pages/form";
	}
	
	@PostMapping(value = "/savePerson")
    public String addNewPerson(Person person, Model model) {
	personrepo.save(new Person(person.getFirstName(), person.getLastName(), person.getCompany(),person.getGradYear(),person.getLinkedin(),person.getMobileNumber(),person.getConnectionType()));
	model.addAttribute("First Name", person.getFirstName());
	model.addAttribute("Last Name", person.getLastName());
	model.addAttribute("Company", person.getCompany());
	model.addAttribute("GradYear", person.getGradYear());
	model.addAttribute("Linkedin", person.getLinkedin());
	model.addAttribute("Mobile Number", person.getMobileNumber());
	model.addAttribute("Connection Type", person.getConnectionType());
	return "pages/thankyou";
    }
}
