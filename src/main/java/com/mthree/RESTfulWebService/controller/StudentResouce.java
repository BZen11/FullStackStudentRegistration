package com.mthree.RESTfulWebService.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mthree.RESTfulWebService.Student;
import com.mthree.RESTfulWebService.service.IService;

@RestController
@CrossOrigin(origins = "*")
public class StudentResouce {
	@Autowired
	private IService service;
	
	
	@GetMapping(path = "/student")
	public List<Student> retrieveAllStudents(){ 
		return service.findAll();
	}
	
//	@GetMapping(value = "/students")
//	public String getTemplate(Model model) {
//		System.out.println("Inside getTemplate() ");
//		System.out.println("Invoking service layer");
//		model.addAttribute("stu", service.findAll());
//		return "studenttemplate";
//	}
	
	@PostMapping(path = "/student")
	public Student createStudent(@RequestBody @Valid Student student, BindingResult result, Model model) { 
			return service.save(student);
	}
	
	@DeleteMapping(path = "/student/{id}")
	public Student removeUser(@PathVariable int id) {
		return service.deleteById(id);
	}

}
