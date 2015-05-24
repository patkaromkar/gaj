/**
 * 
 */
package com.gg.aashiyana.vomapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.gg.aashiyana.domain.User;
import com.gg.aashiyana.web.vo.ContactInfoVO;
import com.gg.aashiyana.web.vo.UserVO;

/**
 * @author User
 *
 */
@Component
@Qualifier("userVOMapper")
public class UserVOMapper implements VOMapper<UserVO, User>{

	@Override
	public UserVO populateVOFromDomain(User user) {
		UserVO userVO = new UserVO();
		userVO.setFirstName(user.getFirstName());
		userVO.setLastName(user.getLastName());
		userVO.setIsActive(user.getIsActive());
		userVO.setIsCoOwner(user.getIsCoOwner());
		userVO.setIsOwner(user.getIsOwner());
		userVO.setUserId(user.getUserId());
		userVO.setPhotoPath(user.getPhotoPath());
		return userVO;
	}

	@Override
	public User populateDomainFromVO(UserVO userVO) {
		User user = new User();
		user.setFirstName(userVO.getFirstName());
		user.setLastName(userVO.getLastName());
		user.setIsActive(userVO.getIsActive());
		user.setIsCoOwner(userVO.getIsCoOwner());
		user.setIsOwner(userVO.getIsOwner());
		user.setUserId(userVO.getUserId());
		user.setPhotoPath(userVO.getPhotoPath());
		List<ContactInfoVO> contactInfos = userVO.getContactInfos();
		for (ContactInfoVO contactInfoVO : contactInfos) {
			
		}
		return user;
	}

}
