package com.learn.map2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Asset {

	@Id
	private int assetId;
	private String assetName;
	
	@ManyToOne
	private Employee employee;

	public Asset() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAssetId() {
		return assetId;
	}

	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Asset(int assetId, String assetName, Employee employee) {
		super();
		this.assetId = assetId;
		this.assetName = assetName;
		this.employee = employee;
	}
	
}
