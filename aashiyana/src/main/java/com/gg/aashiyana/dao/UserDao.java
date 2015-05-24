/**
 * 
 */
package com.gg.aashiyana.dao;

import java.util.List;

import com.gg.aashiyana.domain.User;

/**
 * @author User
 *
 */
public interface UserDao {
	
	Integer insertUser(User user);
	
	void updateUser(User user);

	User getUserById(Integer userId);
	
	List<User> getAllUsers();
}
