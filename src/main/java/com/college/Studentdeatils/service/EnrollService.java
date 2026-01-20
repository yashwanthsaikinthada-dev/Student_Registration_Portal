package com.college.Studentdeatils.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.BookStore.entity.Book;
import com.bookstore.BookStore.entity.MyBookList;
import com.college.Studentdeatils.entity.Courses;
import com.college.Studentdeatils.entity.Enroll;
import com.college.Studentdeatils.entity.Students;
import com.college.Studentdeatils.repository.CourseRepository;
import com.college.Studentdeatils.repository.EnrollRepository;
import com.college.Studentdeatils.repository.StudentRepository;

@Service
public class EnrollService 
{
	@Autowired
	private EnrollRepository eRepo;
	
	public void save(Enroll e)
	{
		eRepo.save(e);
	}
	
	public void deleteById (int eid)
	{
		eRepo.deleteById(eid);
	}
	
	public List<Enroll> getMyList()
	{
		return eRepo.findAll();
	}

	public List<Enroll> getAllEnrollments() {
		// TODO Auto-generated method stub
		return eRepo.findAll();
	}

	


}
