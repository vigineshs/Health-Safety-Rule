package com.rule.safety.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Organizations")
public class Organizations {

	public Organizations() {
		
	}

	public Organizations(String orgname, int cityID, int stateID) {
		this.orgname = orgname;
		this.cityID = cityID;
		this.stateID = stateID;
	}
	
	@Column(name="cityid", unique=true, nullable=false)
	private Integer cityID;
	
	@Column(name="stateid", unique=true, nullable=false)
	private Integer stateID;
	
	@Column(name="orgname", unique=true, nullable=false, length=45)
	private String orgname;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="orgid", unique=true, nullable=false)
	private Integer orgID;

	public Integer getCityID() {
		return cityID;
	}

	public void setCityID(Integer cityID) {
		this.cityID = cityID;
	}

	public String getOrgname() {
		return orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}

	public Integer getOrgID() {
		return orgID;
	}

	public void setOrgID(Integer orgID) {
		this.orgID = orgID;
	}

	public Integer getStateidID() {
		return stateID;
	}

	public void setStateID(Integer stateID) {
		this.stateID = stateID;
	}
	
}
