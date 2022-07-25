package com.example.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.Repository.StudentRepository;
import com.example.demo.Service.Interface.StudentDaoInterface;
import com.example.model.Student;

@Service
public class StudentDaoImpl implements StudentDaoInterface{
	
	@Autowired
	@Qualifier
	private StudentRepository studentRepo;

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentRepo.save(student);
	}

	@Override
	public List<Student> findAllStudent() {
		return (List<Student>) studentRepo.findAll();
		
	}

	@Override
	public String delete(int id) {
		studentRepo.deleteById(id);
		return "Success";
	}
	
	

}
