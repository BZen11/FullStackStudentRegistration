package com.mthree.RESTfulWebService.service;

import java.util.List;

import com.mthree.RESTfulWebService.Student;

public interface IService {
	public List<Student> findAll();
	public Student save(Student student);
	public Student deleteById(int id);
}
