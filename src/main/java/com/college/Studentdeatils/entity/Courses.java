package com.college.Studentdeatils.entity;
import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Courses 
{
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int  cid;
	private String coursename;
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	

	public Courses(int cid, String coursename, List<Students> students) {
		super();
		this.cid = cid;
		this.coursename = coursename;
	
	}

	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
