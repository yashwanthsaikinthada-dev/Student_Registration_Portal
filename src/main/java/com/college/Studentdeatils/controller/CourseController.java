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

import com.college.Studentdeatils.entity.Courses;
import com.college.Studentdeatils.entity.Students;
import com.college.Studentdeatils.repository.StudentRepository;
import com.college.Studentdeatils.service.CourseService;

import ch.qos.logback.core.model.Model;



@Controller
public class CourseController
{
	
	@Autowired
	private CourseService cservice;
	
	@GetMapping("/course_register")
	public String courseRegistration()
	{
		return "CourseRegistration";
	}
	
	@RequestMapping("/courses")
	public ModelAndView getAllCourses()
	{
		List<Courses> list = cservice.getAllCourses();
		return new ModelAndView("CoursesList","Courses",list);
	}
	@PostMapping("/csave")
	public String addCourse(@ModelAttribute Courses c)
	{
		cservice.save(c);
		return "redirect:/courses";
	}
	
	@RequestMapping("/deleteCourse/{cid}")
	public String deleteCourse(@PathVariable("cid") int cid,Model model)
	{
		cservice.deleteById(cid);
		return "redirect:/courses";
	}
	
	
	

}
