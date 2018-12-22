package com.ingecno.dmart.model;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "userDetailId")
	private int userDetailId;

	@OneToOne
	private User user;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "createdDTM")
	private LocalDate createdDTM;
	
	@Column(name = "modifiedDTM")
	private LocalDate modifiedDTM;
	
	@Column(name = "created_uId")
	private String createduId;
	
	@Column(name = "modified_uId")
	private String modifieduId;
	
	@Column(name = "verificationId")
	private String verificationId;
	
	@Column(name = "expiryDate")
	private Date expiryDate;
	
	@Column(name = "contactNo")
	private String contactNo;
	
	@Column(name = "emailId")
	private String emailId;
	
	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getCreatedDTM() {
		return createdDTM;
	}

	public void setCreatedDTM(LocalDate createdDTM) {
		this.createdDTM = createdDTM;
	}

	public LocalDate getModifiedDTM() {
		return modifiedDTM;
	}

	public void setModifiedDTM(LocalDate modifiedDTM) {
		this.modifiedDTM = modifiedDTM;
	}

	public String getCreateduId() {
		return createduId;
	}

	public void setCreateduId(String createduId) {
		this.createduId = createduId;
	}

	public String getModifieduId() {
		return modifieduId;
	}

	public void setModifieduId(String modifieduId) {
		this.modifieduId = modifieduId;
	}

	public String getVerificationId() {
		return verificationId;
	}

	public void setVerificationId(String verificationId) {
		this.verificationId = verificationId;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getUserDetailId() {
		return userDetailId;
	}
	public void setUserDetailId(int userDetailId) {
		this.userDetailId = userDetailId;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "UserDetails [userDetailId=" + userDetailId + ", user=" + user + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", status=" + status + ", gender=" + gender + ", createdDTM=" + createdDTM
				+ ", modifiedDTM=" + modifiedDTM + ", createduId=" + createduId + ", modifieduId=" + modifieduId
				+ ", verificationId=" + verificationId + ", expiryDate=" + expiryDate + ", contactNo=" + contactNo
				+ ", emailId=" + emailId + "]";
	}
	
	
}
