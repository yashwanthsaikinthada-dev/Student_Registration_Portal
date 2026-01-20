package com.college.Studentdeatils.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.college.Studentdeatils.entity.Courses;
import com.college.Studentdeatils.entity.Students;
@Repository
public interface CourseRepository extends JpaRepository<Courses,Integer>
{
	
}
