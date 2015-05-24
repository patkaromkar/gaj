/**
 * 
 */
package com.gg.aashiyana.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author User
 *
 */

@Entity
public class ContactInfo implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CONTACTINFOID")
	Integer contactInfoId;
	
	@Column(name="INFOTYPE")
	String infoType;
	
	@Column(name="VALUE")
	String value;
	
	@ManyToOne
	@JoinColumn(name="USERID")
	User user;

	/**
	 * @return the contactInfoId
	 */
	public Integer getContactInfoId() {
		return contactInfoId;
	}

	/**
	 * @param contactInfoId the contactInfoId to set
	 */
	public void setContactInfoId(Integer contactInfoId) {
		this.contactInfoId = contactInfoId;
	}

	/**
	 * @return the infoType
	 */
	public String getInfoType() {
		return infoType;
	}

	/**
	 * @param infoType the infoType to set
	 */
	public void setInfoType(String infoType) {
		this.infoType = infoType;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
