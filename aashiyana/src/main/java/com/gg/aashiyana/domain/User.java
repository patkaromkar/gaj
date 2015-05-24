/**
 * 
 */
package com.gg.aashiyana.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

/**
 * @author User
 *
 */

@Entity
@Table(name="USER")
public class User {
	
	Integer userId;
	
	String firstName;
	String lastName;
	Boolean isOwner;
	Boolean isCoOwner;
	Boolean isActive;
	String photoPath;
	
	
	Set<ContactInfo> contactInfos = new HashSet<ContactInfo>();
	Set<UnitUserXref> userUnits = new HashSet<UnitUserXref>();
	
	/**
	 * @return the isActive
	 */
	@Column(name="ISACTIVE")
	@Type(type="yes_no")
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
	 * @return the isCoOwner
	 */
	@Column(name="ISCOOWNER")
	@Type(type="yes_no")
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
	 * @return the photoPath
	 */
	@Column(name="PHOTOPATH")
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
	 * @return the isOwner
	 */
	@Column(name="ISOWNER")
	@Type(type="yes_no")
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
	 * @return the userId
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USERID")
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
	@Column(name="FIRSTNAME")
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
	@Column(name="LASTNAME")
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
	 * @return the userUnits
	 */
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="unitUserXrefId.user")
	public Set<UnitUserXref> getUserUnits() {
		return userUnits;
	}
	/**
	 * @param userUnits the userUnits to set
	 */
	public void setUserUnits(Set<UnitUserXref> userUnits) {
		this.userUnits = userUnits;
	}
	/**
	 * @return the contactInfos
	 */
	@OneToMany(mappedBy="user")
	public Set<ContactInfo> getContactInfos() {
		return contactInfos;
	}
	/**
	 * @param contactInfos the contactInfos to set
	 */
	public void setContactInfos(Set<ContactInfo> contactInfos) {
		this.contactInfos = contactInfos;
	}
	

}
