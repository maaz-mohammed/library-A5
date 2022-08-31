/**
 * 
 */
package com.nagarro.library.controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.library.model.User;
import com.nagarro.library.service.UserService;

/**
 * @author mohammedmaaz
 *
 */
@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public ModelAndView user() {
		ModelAndView mavObj = new ModelAndView("login");
		mavObj.addObject("user", new User());
		return mavObj;
	}

	@PostMapping("/")
	public String login(@ModelAttribute("user") User user1) {
		User uObj = userService.doLogin(user1.getUsername(), user1.getPassword());
		System.out.println(uObj);
		if (Objects.nonNull(uObj)) {
			return "redirect:/home.jsp";
		}
		else
			return "redirct:/";
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request,HttpServletResponse response)
	{
		return "redirect:/";
		
	}

	
	

}
