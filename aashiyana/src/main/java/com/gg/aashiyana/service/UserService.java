/**
 * 
 */
package com.gg.aashiyana.service;

import java.util.List;

import com.gg.aashiyana.web.vo.UserVO;


/**
 * @author User
 *
 */
public interface UserService {

	UserVO updateUser(UserVO userVO);
	
	List<UserVO> getAllUsers();
	
	UserVO getUserById(Integer userId);
	
}
