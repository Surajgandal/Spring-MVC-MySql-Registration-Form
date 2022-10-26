package springmvc.controller;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

    @RequestMapping(path="/home", method=RequestMethod.GET)
	public String home(Model model) {
    	System.out.println("this is home url");
    	model.addAttribute("cname","suraj Gandal");
    	model.addAttribute("id",25);
    	
    	List<String> friends =new ArrayList<String>();
    	friends.add("joshi");
    	friends.add("onkar");
    	friends.add("rohit");
    	
    	model.addAttribute("f",friends);
		return "index";
	}
    
    @RequestMapping("/about")
 	public String about() {
     	System.out.println("this is about url");
 		return "about";
 	}
    
    @RequestMapping("/help")
    public ModelAndView help() {
    	System.out.println("this is help url");
    	
    	//creating ModelAndView object
    	ModelAndView  mv = new ModelAndView();
    	
//    	setting the data
    	mv.addObject("name","suraj");
    	mv.addObject("rollNo",123);
    	
    	LocalDateTime now = LocalDateTime.now();
    	mv.addObject("time",now);
    	
    	List<Integer> m = new ArrayList<Integer>();
    	m.add(12);
    	m.add(25);
    	m.add(10);
    	m.add(14);
    	m.add(13);
    	
    	mv.addObject("marks",m);
    	
//    	setting the view name 
    	mv.setViewName("help");
    	
    	return mv;
    	
    }
}
