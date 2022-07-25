package com.example.demo.Service.Interface;

import java.util.List;

import com.example.model.Student;


public interface StudentDaoInterface {
	
	
	public Student saveStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public List<Student> findAllStudent();
	
	public String delete(int id);

}
