package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.user;
import springmvc.service.userService;

@Controller
public class contactController {
	
	@Autowired
	private userService uService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header","Suraj Gandal");
		m.addAttribute("Desc","Learn Coding");
	}
	
	@RequestMapping("/contact")
	public String showForm() {
		
		return "contact";
	}
	
	@RequestMapping(path="processform",method=RequestMethod.POST)
	/*public String handleForm(HttpServletRequest request) {*/
	/*
	 * String email=request.getParameter("email");
	 * System.out.println("user email is "+email);
	 */
	public String handleForm(@ModelAttribute user u, Model m) {
		System.out.println(u);
		
		
		  if(u.getUserName().isBlank()) { 
			  return "redirect:/contact"; }
		 
		
		
		int createdUser =this.uService.createUser(u);
		m.addAttribute("msg", "User created with id"+createdUser);
		return "success";
	}
	
	
	
	/*
	public String handleForm(@RequestParam("email") String userEmail,
			@RequestParam("userName" ) String userName,
			@RequestParam("password") String userPassword, Model m) {
		System.out.println("user email"+userEmail);
		System.out.println("user Name"+userEmail);
		System.out.println("user Password"+userPassword);
		
		m.addAttribute("name", userName);
		m.addAttribute("email", userEmail);
		m.addAttribute("password", userPassword);
		
		user u = new user();
		u.setPassword(userPassword);
		u.setUserName(userName);
		u.setEmail(userEmail);
		m.addAttribute("user",u);
		return "success";
	}
*/
}
