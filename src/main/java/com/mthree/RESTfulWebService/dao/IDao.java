package com.mthree.RESTfulWebService.dao;

import java.util.List;

import com.mthree.RESTfulWebService.Student;

public interface IDao {
	public List<Student> findAll();
	public Student save(Student student);
	public Student deleteById(int id);

}
