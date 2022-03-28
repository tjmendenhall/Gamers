package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.User;
import dmacc.repository.UserRepository;

/**
 * @author dynob - tjmendenhall2@dmacc.edu
 * CIS175 - Fall 2021
 * Mar 19, 2022
 */
@Controller
public class WebController {
	@Autowired
	UserRepository repo;
	
	@GetMapping({ "/", "viewAll" })
	public String viewAllUsers(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewUser(model);
		}
		
		model.addAttribute("users", repo.findAll());
		return "results";
	}

	@GetMapping("/inputUser")
	public String addNewUser(Model model) {
		User c = new User();
		model.addAttribute("newUser", c);
		return "input";
	}

	@GetMapping("/edit/{id}")
	public String showUpdateContact(@PathVariable("id") long id, Model model) {
		User c = repo.findById(id).orElse(null);
		System.out.println("ITEM TO EDIT: " + c.toString());
		model.addAttribute("newUser", c);
		return "input";
	}

	@PostMapping("/update/{id}")
	public String reviseUser(User c, Model model) {
		repo.save(c);
		return viewAllUsers(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		User c = repo.findById(id).orElse(null);
	    repo.delete(c);
	    return viewAllUsers(model);
	}
}
