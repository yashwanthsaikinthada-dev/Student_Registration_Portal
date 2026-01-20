package com.college.Studentdeatils.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.Studentdeatils.entity.Courses;
import com.college.Studentdeatils.repository.CourseRepository;

@Service
public class CourseService
{
	@Autowired
	private CourseRepository cRepo;
	
	public void save(Courses c)
	{
		cRepo.save(c);
	}
	public List<Courses> getAllCourses()
	{
		return cRepo.findAll();
	}
	public Courses getCourseById(int cid)
	{
		return cRepo.findById(cid).get();
	}
	public void deleteById (int cid)
	{
		cRepo.deleteById(cid);
	}


}
