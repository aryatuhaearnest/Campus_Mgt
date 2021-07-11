package com.example.earnest.SchMgt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.earnest.SchMgt.model.Student;
import com.example.earnest.SchMgt.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
private StudentRepository studentRepository;
	
	
	public Student createStudent(Student student) {
		
		return studentRepository.save(student);
	}
	
	public List<Student> getStudents() {
		Iterable<Student> iU =studentRepository.findAll();
		List<Student> students =new ArrayList<Student>();
				iU.forEach((student) -> students.add(student));
		return students;
	}
	
	public Student getById(String id) {
		Optional <Student> oS =studentRepository.findById(id);
		if(oS.isPresent()){
			return oS.get();
			
		}return null;
	}
	
	public void deleteUSerById(String id) {
		studentRepository.deleteById(id);
	}
	
	public void deleteUsers(Student student) {
		studentRepository.delete(student);
	}
	
	public Student updateStudentById(Student student, String id) {
		Student studentToUpdate =studentRepository.findById(id).get();
		if(studentToUpdate != null) {
			studentToUpdate.setFullname(student.getFullname());
			studentToUpdate.setCourse(student.getCourse());
			studentToUpdate.setDepartment(student.getDepartment());
			
			studentToUpdate =studentRepository.save(studentToUpdate);
			
		}
		return studentToUpdate;
	}
	
	public Student updateStudent( Student student) {
		
		Student studentToUpdate = studentRepository.findById(student.getId()).get(); 
		studentToUpdate.setFullname(student.getFullname());
		studentToUpdate.setCourse(student.getCourse());
		studentToUpdate.setDepartment(student.getDepartment());
		
		studentToUpdate =studentRepository.save(studentToUpdate);
		return studentToUpdate;
	}
	
}
