package com.rule.safety.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cities")
public class Cities {
	public Cities() {
		
	}

	public Cities(String cityname, int stateID) {
		this.cityname = cityname;
		this.stateID = stateID;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cityid", unique=true, nullable=false)
	private Integer cityID;
	
	@Column(name="cityname", unique=true, nullable=false, length=45)
	private String cityname;
	
	@Column(name="stateid", unique=true, nullable=false)
	private Integer stateID;
	
	public Integer getCityID() {
		return cityID;
	}

	public void setCityID(Integer cityID) {
		this.cityID = cityID;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public Integer getStateID() {
		return stateID;
	}

	public void setStateID(Integer stateID) {
		this.stateID = stateID;
	}

}
