package com.college.Studentdeatils.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import com.college.Studentdeatils.entity.Students;

@Repository
public interface StudentRepository extends JpaRepository<Students,Integer>
{
	@Query("select count(sid)from Students")
	public int countRows();

}

