package com.lgm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lgm.model.Admin;
import com.lgm.model.User;
import com.lgm.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@RequestMapping("/loginAdmin.do")
	public ModelAndView loginAdmin(Admin admin,HttpSession session){
		ModelAndView mv = new ModelAndView();
		if(userService.loginAdmin(admin)){
			session.setAttribute("admin", admin);
			mv.setViewName("success");
		}else{
			mv.setViewName("redirect:/jsp/loginAdmin.jsp");
		}
		return mv;
	}
	
	@RequestMapping("/loginUser.do")
	public ModelAndView loginUser(User user,HttpSession session){
		ModelAndView mv = new ModelAndView();
		if(userService.loginUser(user)){
			session.setAttribute("user", user);
			mv.setViewName("success");
		}else{
			mv.setViewName("redirect:/jsp/loginUser.jsp");
		}
		return mv;
	}
	
	@RequestMapping("/addUser.do")
	public ModelAndView addUser(User user){
		ModelAndView mv = new ModelAndView();
		if(userService.addUser(user)){
			mv.setViewName("success");
		}
		return mv;
	}
	
	@RequestMapping("/getUsers.do")
	public ModelAndView getUsers(){
		ModelAndView mv = new ModelAndView();
		List<User> list = userService.getUsers();
		
		mv.addObject("userList", list);
		mv.setViewName("success");
		return mv;
	}
}
