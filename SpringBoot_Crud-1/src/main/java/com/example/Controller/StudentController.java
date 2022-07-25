package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServiceImpl.StudentDaoImpl;
import com.example.model.Student;

@Controller
@RestController
@CrossOrigin("*")
public class StudentController {

	@Autowired
	private StudentDaoImpl studentDaoImpl;

	// Save the student values
	@PostMapping(value = "saveStudent")
	public Student saveStudent(@RequestBody Student student) {

		studentDaoImpl.saveStudent(student);
		return student;
	}

	// Update the student values
	@PutMapping(value = "updateMapping")
	public Student updateStudent(@RequestBody Student student) {
		return studentDaoImpl.updateStudent(student);
	}

	// Find the student values
	@GetMapping("findStudent")
	public List<Student> findAllStudent() {
		return studentDaoImpl.findAllStudent();

	}

	// Delete the student values
	public String delete(int id) {
		studentDaoImpl.delete(id);
		return "Successfully deleted";
	}
}
