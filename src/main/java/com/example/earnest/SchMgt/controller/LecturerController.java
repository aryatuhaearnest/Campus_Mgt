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

import com.example.earnest.SchMgt.model.Lecturer;
import com.example.earnest.SchMgt.service.LecturerService;

@RestController
public class LecturerController {
	@Autowired
private LecturerService lecturerService;
	
//	@PostMapping("/lecturer")
//	public Lecturer createLecturer(@RequestBody Lecturer lecturer) {
//		return lecturerService.createLecturer(lecturer);
//	}
//	@GetMapping("/lecturer/{id}")
//	public Lecturer getById(@PathVariable("id") String id) {
//		
//		return lecturerService.getById(id);
//	}
//	
//	@GetMapping("/lecturers")
//	public List<Lecturer> getLecturers() {
//		return lecturerService.getLecturers();
//	}
//	
//	@DeleteMapping("/lecturer")
//	public void deleteLecturer(@RequestBody Lecturer lecturer) {
//		lecturerService.deleteLecturer(lecturer);
//	}
//	@DeleteMapping("/lecturers/{id}")
//	public void deleteLecturerById(@PathVariable("id") String id) {
//		lecturerService.deleteLecturerById(id);
//	}
//	
//	@PutMapping("/lecturers/{id}")
//	public Lecturer updateLecturerById(@PathVariable("id") String id , @RequestBody Lecturer lecturer )  {
//			return lecturerService.updateLecturerById(id, lecturer);
//	}
//	
//	@PutMapping("/lecturers")
//	public Lecturer updateLecturer(@RequestBody Lecturer lecturer) {
//		return lecturerService.updateLecturer(lecturer);
//	}
	
}
