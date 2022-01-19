package com.kingo.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
//	@RequestMapping("home")
//	@ResponseBody -- It prints whatever we mention in return block
//	public String home(HttpServletRequest req) {
//		HttpSession ses = req.getSession();
//		String name = req.getParameter("name");
//		
//		System.out.println("Hello "+name+" Well Done Dude.");
//		ses.setAttribute("name", name);
//		return "Home";
//	}
	
	
	//Note: Passing parameters as single variables using ModelandView
//	@RequestMapping("home")
//	public ModelAndView home(@RequestParam("name") String myname) { //"name" is the key which would be coming from client.
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("name", myname);		
//		mv.setViewName("Home");
//		return mv;
//	}
	
	@RequestMapping("home")
	public ModelAndView home(students stud) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", stud);
		mv.setViewName("Home");
		return mv;
	}
	

}
