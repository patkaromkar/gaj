/**
 * 
 */
package com.gg.aashiyana.web.vo;

/**
 * @author User
 *
 */
public class ContactInfoVO {

	Integer contactInfoId;
	String infoType;
	String value;
	
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
}
