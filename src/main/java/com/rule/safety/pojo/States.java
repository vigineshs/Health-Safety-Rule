package com.rule.safety.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="States")
public class States {
	public States() {
		
	}

	public States(String statename) {
		this.statename = statename;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="stateid", unique=true, nullable=false)
	private Integer stateID;
	
	@Column(name="statename", unique=true, nullable=false, length=45)
	private String statename;

	public Integer getStateID() {
		return stateID;
	}

	public void setStateID(Integer stateID) {
		this.stateID = stateID;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}
	
}
