package com.mthree.RESTfulWebService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stu")
public class Student {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private String age;
	@Column
	private String mobileNumber;
	@Column
	private String address;
	
	public Student() {}
	
	

	public Student(String name, String age, String mobileNumber, String address) {
		super();
		this.name = name;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", mobileNumber=" + mobileNumber + ", address=" + address
				+ "]";
	}
	
	

}
