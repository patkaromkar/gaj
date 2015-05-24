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

/**
 * @author User
 *
 */
@Entity
@Table(name="UNIT")
public class Unit {
	
	Integer unitId;
	
	public Set<UnitUserXref> unitUsers = new HashSet<UnitUserXref>();

	/**
	 * @return the unitId
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="UNITID")
	public Integer getUnitId() {
		return unitId;
	}

	/**
	 * @param unitId the unitId to set
	 */
	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}

	/**
	 * @return the unitUsers
	 */
	@OneToMany(mappedBy="unitUserXrefId.unit", fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	public Set<UnitUserXref> getUnitUsers() {
		return unitUsers;
	}

	/**
	 * @param unitUsers the unitUsers to set
	 */
	public void setUnitUsers(Set<UnitUserXref> unitUsers) {
		this.unitUsers = unitUsers;
	}
}
