/**
 * 
 */
package com.nagarro.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.library.model.User;
import com.nagarro.library.repository.UserRepository;

/**
 * @author mohammedmaaz
 *
 */
@Service
public class UserService{ 

	@Autowired
	private UserRepository userRepository;
	
	public User doLogin(String username,String password)
	{
		User userObj=userRepository.findByUsernameAndPassword(username, password);
		return userObj;
	}
	
	public List<User> getAllUsers()
	{
		List<User> uList;
		uList=userRepository.findAll();
		return uList;
	}
}
