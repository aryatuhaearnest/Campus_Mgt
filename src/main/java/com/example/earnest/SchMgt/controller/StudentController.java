package com.example.earnest.SchMgt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.earnest.SchMgt.model.Student;
import com.example.earnest.SchMgt.service.StudentService;

@RestController
public class StudentController {
	@Autowired
private StudentService studentService;
	
//	@PostMapping("/createstd")
//	public Student createStudent(@RequestBody Student student) {
//		return student; //studentService.createStudent(student);
//	}
//	@GetMapping("/students")
//	public List<Student> getStudent(){
//		return studentService.getStudents();
//	}
//	@GetMapping("s/tudent/id")
//	public Student getById(@PathVariable("id") String id) {
//		return studentService.getById(id);
//	}
//	@DeleteMapping("/student/id")
//	public void deleteUserById(@PathVariable("id") String id) {
//		studentService.deleteUSerById(id);
//	}
//	
//	
//	@DeleteMapping("/student")
//	public void deleteUsers(Student student) {
//		studentService.deleteUsers(student);
//	}
//	
//	@PutMapping("/student/id")
//	public Student updateStudentById(@PathVariable("id") String id , @RequestBody Student student) {
//		return studentService.updateStudentById(student, id);
//	}
//	@PutMapping("/student")
//	public Student updateStudent(Student student) {
//		return studentService.updateStudent(student);
//	}
//	
}
