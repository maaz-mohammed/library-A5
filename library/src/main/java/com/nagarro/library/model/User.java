/**
 * 
 */
package com.nagarro.library.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

/**
 * @author mohammedmaaz
 *
 */
@Entity
@Component
public class User {
	@Id
	private String username;
	private String password;
	/**
	 * @return the uName
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param uName the uName to set
	 */
	public void setUsername(String uName) {
		this.username = uName;
	}
	/**
	 * @return the uPwd
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param uPwd the uPwd to set
	 */
	public void setPassword(String uPwd) {
		this.password = uPwd;
	}
}
