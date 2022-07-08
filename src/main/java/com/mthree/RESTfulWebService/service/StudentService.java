package com.mthree.RESTfulWebService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mthree.RESTfulWebService.Student;
import com.mthree.RESTfulWebService.dao.IDao;

@Service
public class StudentService implements IService {
	@Autowired
	@Qualifier(value = "stujparepos")
	private IDao dao;

	public StudentService() {}
	
	@Override
	public List<Student> findAll() {
		return dao.findAll();
	}


	@Override
	public Student save(Student student) {
		return dao.save(student);
	}
	
	public Student deleteById(int id){
		return dao.deleteById(id);
	}


}
