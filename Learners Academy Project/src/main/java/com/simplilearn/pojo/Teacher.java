package com.simplilearn.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {

	@Id
	private int tId;
	@Column
	private String tName;
	private String tDOB;
	private String tEmail;
	private String tAddress;
	private long tPhono;
	private String tDesignation;
	
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public String gettDOB() {
		return tDOB;
	}
	public void settDOB(String tDOB) {
		this.tDOB = tDOB;
	}
	public String gettEmail() {
		return tEmail;
	}
	public void settEmail(String tEmail) {
		this.tEmail = tEmail;
	}
	public String gettAddress() {
		return tAddress;
	}
	public void settAddress(String tAddress) {
		this.tAddress = tAddress;
	}
	public long gettPhono() {
		return tPhono;
	}
	public void settPhono(long tPhono) {
		this.tPhono = tPhono;
	}
	public String gettDesignation() {
		return tDesignation;
	}
	public void settDesignation(String tDesignation) {
		this.tDesignation = tDesignation;
	}
	@Override
	public String toString() {
		return "Teacher [tId=" + tId + ", tName=" + tName + ", tDOB=" + tDOB + ", tEmail=" + tEmail + ", tAddress="
				+ tAddress + ", tPhono=" + tPhono + ", tDesignation=" + tDesignation + "]";
	}
	
	
}
