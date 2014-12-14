package com.project.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/Student")
public class StudentController {

	  @Autowired private StudentService studentSvc;
	  
	  @RequestMapping(method = RequestMethod.GET)
	  public String listAll(Model model) {
	    model.addAttribute("students", studentSvc.getAll());
	    return "student";
	  }
	  
	  @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	  public String addStudent(@ModelAttribute Student student) {
		  studentSvc.add(student);
	    return "redirect:/Student";
	  }
	  
}
