package com.cht.springmvc.getControllerValue;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cht.springmvc.entity.User;

@Controller
@RequestMapping("/user")
public class LoginController{
   @RequestMapping("/login")
   public ModelAndView login(User user) {
	   System.out.println(1111);
	   ModelAndView mv=new ModelAndView();
	   mv.addObject("name", user.getUsername());
	   mv.setViewName("success");
	   return mv;
   }
}
