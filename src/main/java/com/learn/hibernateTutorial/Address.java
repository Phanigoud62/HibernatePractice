package com.learn.hibernateTutorial;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
@Table(name="Student_Address")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int aid;
	
	@Column(length=50)
	private String street;
	@Column(length=30)
	private String city;

	@Transient
	private double x;
	@Column(name="Added_Date")
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int aid, String street, String city, double x, Date addedDate) {
		super();
		this.aid = aid;
		this.street = street;
		this.city = city;
		this.x = x;
		this.addedDate = addedDate;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", street=" + street + ", city=" + city + ", x=" + x + ", addedDate=" + addedDate
				+ "]";
	}
	
	
	
	
}
