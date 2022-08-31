/**
 * 
 */
package com.nagarro.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.library.model.User;

/**
 * @author mohammedmaaz
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User,String>{
	User findByUsernameAndPassword(String username, String password);

}
