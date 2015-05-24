/**
 * 
 */
package com.gg.aashiyana.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gg.aashiyana.dao.UserDao;
import com.gg.aashiyana.domain.User;
import com.gg.aashiyana.vomapper.VOMapper;
import com.gg.aashiyana.web.vo.UserVO;

/**
 * @author User
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	@Qualifier("userVOMapper")
	VOMapper<UserVO, User> userVOMapper;

	/* (non-Javadoc)
	 * @see com.gg.aashiyana.service.UserService#updateUser(com.gg.aashiyana.web.vo.UserVO)
	 */
	@Override
	public UserVO updateUser(UserVO userVO) {
		
		User user = userVOMapper.populateDomainFromVO(userVO);
		if(userVO.getUserId() == null){
			Integer userId = userDao.insertUser(user);
			logger.debug("Inserted User with userId#" + userId );
		}else{
			userDao.updateUser(user);
			logger.debug("Updated User with userId#" + user.getUserId() );
		}
		
		return null;
	}

	@Override
	public List<UserVO> getAllUsers() {
		List<UserVO> results = new ArrayList<UserVO>(); 
		List<User> users = userDao.getAllUsers();
		for (User user : users) {
			results.add(userVOMapper.populateVOFromDomain(user));
		}
		return results;
	}
	
	@Override
	public UserVO getUserById(Integer userId) {
		User user = userDao.getUserById(userId);
		return userVOMapper.populateVOFromDomain(user);
	}
	

}
