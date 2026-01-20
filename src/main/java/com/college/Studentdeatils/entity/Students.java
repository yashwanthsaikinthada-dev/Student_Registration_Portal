package com.college.Studentdeatils.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
public class Students 
{
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int  sid;
	private String firstname;
	private String lastname;
	private Date Dateofbirth;
	private String gender;
	private String gmail;
	private String phoneno;
	private String branch;

	
	public Students(int sid, String firstname, String lastname, Date dateofbirth, String gender, String gmail,
			String phoneno, String branch) {
		super();
		this.sid = sid;
		this.firstname = firstname;
		this.lastname = lastname;
		Dateofbirth = dateofbirth;
		this.gender = gender;
		this.gmail = gmail;
		this.phoneno = phoneno;
		this.branch = branch;
		
	}

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDateofbirth() {
		return Dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		Dateofbirth = dateofbirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	
	
}
