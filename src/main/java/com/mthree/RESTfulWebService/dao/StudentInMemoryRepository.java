package com.mthree.RESTfulWebService.dao;
//package com.mthree.RESTfulWebService.dao;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.context.annotation.Profile;
//import org.springframework.stereotype.Repository;
//
//import com.mthree.RESTfulWebService.Student;
//import com.mthree.RESTfulWebService.exceptions.UserNotFoundException;
//
//@Repository(value = "stumemoryrepos")
//@Profile("dev")
//public class UserInMemoryRepository implements IDao {
//	private static List<Student> students = null;
//	private static int userCount = 3;
//	
//	static {
//		students = new ArrayList<Student>();
//		students.add(new Student("Blake","23", "51295015", "Street st"));
//		students.add(new Student("Bruce", "28", "25908724", "Avenue ave"));
//		students.add(new Student("Jack", "32", "39125212", "Road rd"));
//	}
//	
//	public UserInMemoryRepository() {}
//
//	@Override
//	public List<Student> findAll() {
//		return students;
//	}
//
//	@Override
//	public Student save(Student student) {
//		students.add(student);
//		return student;
//	}
//
//}
