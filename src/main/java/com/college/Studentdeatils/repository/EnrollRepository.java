package com.college.Studentdeatils.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.Studentdeatils.entity.Enroll;
import com.college.Studentdeatils.entity.Students;
@Repository
public interface EnrollRepository extends JpaRepository<Enroll,Integer>
{

}
