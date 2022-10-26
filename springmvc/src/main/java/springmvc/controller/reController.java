package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class reController {

	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("This is first handlar");
		RedirectView RV = new RedirectView();
//		 RV.setUrl("enjoy"); 
		 RV.setUrl("https://www.google.com"); 
		return RV;
		
	//	return "redirect:/enjoy";
		
	}
	
	@RequestMapping("/enjoy")
	public String two() {
		System.out.println("This is second handlar[/enjoy]");
		return "contact";
	}
	
	
}
