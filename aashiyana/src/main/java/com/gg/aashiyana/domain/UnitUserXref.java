/**
 * 
 */
package com.gg.aashiyana.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * @author User
 * 
 */
@Entity
@Table(name = "UNITUSERXREF")
@AssociationOverrides({
		@AssociationOverride(name="unitUserXrefId.user", joinColumns = @JoinColumn(name="USERID")),
		@AssociationOverride(name="unitUserXrefId.unit", joinColumns = @JoinColumn(name="UNITID")) })
public class UnitUserXref implements Serializable{

	UnitUserXrefId unitUserXrefId = new UnitUserXrefId();

	Date startFrom;

	Date endOn;

	/**
	 * @return
	 */
	@Transient
	public Unit getUnit(){
		return getUnitUserXrefId().getUnit();
	}
	
	/**
	 * @param unit
	 */
	public void setUnit(Unit unit){
		getUnitUserXrefId().setUnit(unit);
	}
	
	/**
	 * @return
	 */
	@Transient
	public User getUser(){
		return getUnitUserXrefId().getUser();
	}
	
	/**
	 * @param user
	 */
	public void setUser(User user){
		getUnitUserXrefId().setUser(user);
	}
	
	/**
	 * @return the unitUserXrefId
	 */
	@EmbeddedId
	public UnitUserXrefId getUnitUserXrefId() {
		return unitUserXrefId;
	}

	/**
	 * @param unitUserXrefId
	 *            the unitUserXrefId to set
	 */
	public void setUnitUserXrefId(UnitUserXrefId unitUserXrefId) {
		this.unitUserXrefId = unitUserXrefId;
	}

	/**
	 * @return the startFrom
	 */
	@Temporal(TemporalType.DATE)
	@Column(name="STARTFROM")
	public Date getStartFrom() {
		return startFrom;
	}

	/**
	 * @param startFrom
	 *            the startFrom to set
	 */
	public void setStartFrom(Date startFrom) {
		this.startFrom = startFrom;
	}

	/**
	 * @return the endOn
	 */
	@Temporal(TemporalType.DATE)
	@Column(name="ENDON")
	public Date getEndOn() {
		return endOn;
	}

	/**
	 * @param endOn
	 *            the endOn to set
	 */
	public void setEndOn(Date endOn) {
		this.endOn = endOn;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((unitUserXrefId == null) ? 0 : unitUserXrefId.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnitUserXref other = (UnitUserXref) obj;
		if (unitUserXrefId == null) {
			if (other.unitUserXrefId != null)
				return false;
		} else if (!unitUserXrefId.equals(other.unitUserXrefId))
			return false;
		return true;
	}
}
