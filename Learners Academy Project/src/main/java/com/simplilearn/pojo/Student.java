package com.simplilearn.pojo;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	private int studentId;
	@Column
	private String studentName;
	private String studentDOB;
	private String studentEmail;
	private String studentAddress;
	private long studentPhono;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="classId")
	private Classes classes;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(String studentDOB) {
		this.studentDOB = studentDOB;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public long getStudentPhono() {
		return studentPhono;
	}

	public void setStudentPhono(long studentPhono) {
		this.studentPhono = studentPhono;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentDOB=" + studentDOB
				+ ", studentEmail=" + studentEmail + ", studentAddress=" + studentAddress + ", studentPhono="
				+ studentPhono + ", classes=" + classes + "]";
	}
	
	
	
}