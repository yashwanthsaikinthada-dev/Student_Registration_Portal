package com.college.Studentdeatils.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Enroll 
{
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int eid;
	
	private int sid;
	
    private String lastname;
    
	 private int cid; 
	
	private String coursename;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	  public int getCid() 
	  {
		  return cid; 
	  }
	  
	  public void setCid(int cid)
	  { 
		  this.cid = cid; 
	  }
	 

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public Enroll( int sid,String lastname, int cid, String coursename) {
		super();
		this.sid = sid;
		this.lastname=lastname;
		 this.cid = cid; 
		this.coursename=coursename;
	}

	public Enroll() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
