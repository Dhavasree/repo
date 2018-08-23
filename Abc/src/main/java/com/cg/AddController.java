package com.cg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController 
{
	@RequestMapping("login")
public ModelAndView login(@RequestParam("username") String username,@RequestParam("password") String password)

{
	ModelAndView mv= new ModelAndView();
    mv.addObject("username",username);
    mv.addObject("password",password);
    mv.setViewName("login");
	return mv;	
}
	
	@RequestMapping("log")
	
	public ModelAndView add1()
	{
		return new ModelAndView("adddetails");
	}
	
	
	@RequestMapping("adddetails")
	public ModelAndView add(@RequestParam("firstname") String firstname,@RequestParam("lastname") String lastname,@RequestParam("address") String address
			,@RequestParam("age") int age,@RequestParam("gender") String gender)

	{
		ModelAndView mv= new ModelAndView();
		
		
		mv.addObject("firstname",firstname);
	    mv.addObject("lastname",lastname);
	    mv.addObject("address",address);
	    mv.addObject("age",age);
	    mv.addObject("gender",gender);
	    mv.setViewName("success");
		return mv;
		
	}
	
}
