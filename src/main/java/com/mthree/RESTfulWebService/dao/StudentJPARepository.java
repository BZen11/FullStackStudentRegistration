package com.mthree.RESTfulWebService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mthree.RESTfulWebService.Student;

@Repository(value = "stujparepos")
public interface StudentJPARepository extends IDao, JpaRepository<Student, Integer> {

}
