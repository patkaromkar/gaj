/**
 * 
 */
package com.gg.aashiyana.web.vo;

import java.util.List;

/**
 * @author User
 *
 */
public class UserVO {

	Integer userId;
	String firstName;
	String lastName;
	Boolean isOwner;
	Boolean isCoOwner;
	Boolean isActive;
	String photoPath;
	
	List<ContactInfoVO> contactInfos;
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the isOwner
	 */
	public Boolean getIsOwner() {
		return isOwner;
	}
	/**
	 * @param isOwner the isOwner to set
	 */
	public void setIsOwner(Boolean isOwner) {
		this.isOwner = isOwner;
	}
	/**
	 * @return the isCoOwner
	 */
	public Boolean getIsCoOwner() {
		return isCoOwner;
	}
	/**
	 * @param isCoOwner the isCoOwner to set
	 */
	public void setIsCoOwner(Boolean isCoOwner) {
		this.isCoOwner = isCoOwner;
	}
	/**
	 * @return the isActive
	 */
	public Boolean getIsActive() {
		return isActive;
	}
	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	/**
	 * @return the photoPath
	 */
	public String getPhotoPath() {
		return photoPath;
	}
	/**
	 * @param photoPath the photoPath to set
	 */
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	/**
	 * @return the contactInfos
	 */
	public List<ContactInfoVO> getContactInfos() {
		return contactInfos;
	}
	/**
	 * @param contactInfos the contactInfos to set
	 */
	public void setContactInfos(List<ContactInfoVO> contactInfos) {
		this.contactInfos = contactInfos;
	}
	
	
}
