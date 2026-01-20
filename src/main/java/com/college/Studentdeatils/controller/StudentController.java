package com.college.Studentdeatils.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;

import com.college.Studentdeatils.entity.Courses;
import com.college.Studentdeatils.entity.Enroll;
import com.college.Studentdeatils.entity.Students;
import com.college.Studentdeatils.repository.EnrollRepository;
import com.college.Studentdeatils.repository.StudentRepository;
import com.college.Studentdeatils.service.CourseService;
import com.college.Studentdeatils.service.StudentService;


@Controller
public class StudentController 
{
	@Autowired
	private StudentService service;
	
	@Autowired
	private CourseService cservice;
	
	@Autowired
	private EnrollRepository erepo;
	
	@GetMapping("/")
	public String home()
	{
		return "home";
	}
	
	  @GetMapping("/student_register") 
	  public String StudentRegistration() 
	  { 
		  return "StudentRegistration"; 
	  }
	  
	  @RequestMapping("/courses/{sid}") 
	  public ModelAndView CoursesList(@PathVariable("sid") int sid) 
	  { 
		  List<Courses> list = cservice.getAllCourses();
			return new ModelAndView("CoursesList","Courses",list);
		  
	  }
	 
	 
	@GetMapping("/students_list")
	public ModelAndView getAllStudent()
	{
		List<Students> list = service.getAllStudent();
		return new ModelAndView("StudentsList","Students",list);
	}
	@PostMapping("/save")
	public String addStudent(@ModelAttribute Students s)
	{
		service.save(s);
		return "completed";
	}
	@RequestMapping("/editStudent/{sid}")
	public String editStudent(@PathVariable("sid") int sid,Model model)
	{
		Students s = service.getStudentById(sid);
		model.addAttribute("Students",s);
		return "StudentEdit";
	}
	@RequestMapping("/deleteStudent/{sid}")
	public String deleteStudent(@PathVariable("sid") int sid,Model model)
	{
		service.deleteById(sid);
		return "redirect:/students_list";
	}
	@RequestMapping("/No_of_students")
	public String countRows(Model model)
	{
		int st = service.countRows();
		model.addAttribute("st",st);
		return "noOfStudents";
	}
}
