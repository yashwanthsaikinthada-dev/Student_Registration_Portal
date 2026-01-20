package com.college.Studentdeatils.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.Studentdeatils.entity.Students;
import com.college.Studentdeatils.repository.StudentRepository;

@Service
public class StudentService 
{
	@Autowired
	private StudentRepository sRepo;
	
	public void save(Students s)
	{
		sRepo.save(s);
	}
	public List<Students> getAllStudent()
	{
		return sRepo.findAll();
	}
	public Students getStudentById(int sid)
	{
		return sRepo.findById(sid).get();
	}
	public void deleteById (int sid)
	{
		sRepo.deleteById(sid);
	}
	public int countRows()
	{
		return (int) sRepo.count();
		
	}

}
