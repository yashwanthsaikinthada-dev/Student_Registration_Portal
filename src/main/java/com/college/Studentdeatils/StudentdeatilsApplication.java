package com.college.Studentdeatils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.college.Studentdeatils.entity.Courses;
import com.college.Studentdeatils.entity.Students;
import com.college.Studentdeatils.repository.CourseRepository;
import com.college.Studentdeatils.repository.StudentRepository;

@SpringBootApplication

public class StudentdeatilsApplication 
{

	public static void main(String[] args) {
		SpringApplication.run(StudentdeatilsApplication.class, args);
	}

}
