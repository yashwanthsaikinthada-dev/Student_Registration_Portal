package com.college.Studentdeatils.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.BookStore.entity.Book;
import com.bookstore.BookStore.entity.MyBookList;
import com.college.Studentdeatils.entity.Courses;
import com.college.Studentdeatils.entity.Enroll;
import com.college.Studentdeatils.entity.Students;
import com.college.Studentdeatils.service.CourseService;
import com.college.Studentdeatils.service.EnrollService;
import com.college.Studentdeatils.service.StudentService;

import ch.qos.logback.core.model.Model;

@Controller
public class EnrollController 
{
	@Autowired
	private EnrollService eservice;
	
	@Autowired
	private CourseService cservice;
	
	@Autowired
	private StudentService sservice;
	
	@RequestMapping("/enrollments")
	public ModelAndView getAllEnrollments()
	{
		List<Enroll> list = eservice.getAllEnrollments();
		return new ModelAndView("enrollment","Enroll",list);
	}
	
	@RequestMapping("/courses/{sid}/enrollments/{cid}")
	public String getMyList(@PathVariable("sid") int sid,@PathVariable("cid") int cid)
	{
		/* System.out.println(sid); */
	    Students s = sservice.getStudentById(sid);
	    Courses c = cservice.getCourseById(cid);
		Enroll e = new Enroll(s.getSid(),s.getLastname(),c.getCid(),c.getCoursename());
		/*
		 * System.out.println(e1.getSid()); System.out.println(e1.getCid());
		 */
		eservice.save(e);
		return "redirect:/enrollments";
	}
	

	@RequestMapping("/deleteenroll/{eid}")
	public String deleteCourse(@PathVariable("eid") int eid,Model model)
	{
		eservice.deleteById(eid);
		return "redirect:/enrollments";
	}
}
