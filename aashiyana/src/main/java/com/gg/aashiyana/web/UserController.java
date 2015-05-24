/**
 * 
 */
package com.gg.aashiyana.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gg.aashiyana.service.UserService;
import com.gg.aashiyana.web.vo.UserVO;

/**
 * @author User
 *
 */

@RestController
@RequestMapping("/maintainUser")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET,produces={"application/json"})
	public List<UserVO> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@RequestMapping(value={"/createUser","/updateUser"},method=RequestMethod.POST,consumes={"application/json"})
	public String updateUser(@RequestBody UserVO userVO){
		userService.updateUser(userVO);
		return "{\"response\":\"SUCCESS\"}";
	}
	
	@RequestMapping(value={"/{userId}"},method=RequestMethod.GET,produces={"application/json"})
	public UserVO editUser(@PathVariable Integer userId){
		return userService.getUserById(userId);
	}
}
