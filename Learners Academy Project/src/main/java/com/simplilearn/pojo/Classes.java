package com.simplilearn.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Classes {
	
	@Id
	private int classId;	
	@Column	
	private String className;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="subId")
	private Subject sub;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="tId")
	private Teacher t;
	

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Subject getSub() {
		return sub;
	}

	public void setSub(Subject sub) {
		this.sub = sub;
	}

	public Teacher getT() {
		return t;
	}

	public void setT(Teacher t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "Classes [classId=" + classId + ", className=" + className + ", sub=" + sub + ", t=" + t + "]";
	}
	

}
