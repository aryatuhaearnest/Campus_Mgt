package com.example.earnest.SchMgt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.earnest.SchMgt.model.Lecturer;
import com.example.earnest.SchMgt.repository.LecturerRepository;

@Service
public class LecturerService {
	@Autowired
private LecturerRepository lecturerRepository;
	
	public Lecturer createLecturer(Lecturer lecturer) {
		return lecturerRepository.save(lecturer);
	}
	
	public Lecturer getById(String id) {
		Optional<Lecturer> lO = lecturerRepository.findById(id);
	  
			if(lO.isPresent()) {
				return lO.get();
			}
		return null;
	}
	public List<Lecturer> getLecturers() {
	Iterable<Lecturer> lI = 	lecturerRepository.findAll();
	List<Lecturer> lecturers = new ArrayList<Lecturer>();
	lI.forEach( (lecturer) -> lecturers.add(lecturer) );
	
		return lecturers;
	}
	
	public void deleteLecturer(Lecturer lecturer) {
		if(lecturer != null)
			lecturerRepository.delete(lecturer);
	}
	
	
	public void deleteLecturerById(String id) {
		lecturerRepository.deleteById(id);
	}
	
	public Lecturer updateLecturerById(String id, Lecturer lecturer) {
		Lecturer lecturerToUpdate =  lecturerRepository.findById(id).get();
		
		if(lecturerToUpdate != null) {
			lecturerToUpdate.setDepartment(lecturer.getDepartment());
			lecturerToUpdate.setName(lecturer.getName());
			lecturerToUpdate = lecturerRepository.save(lecturerToUpdate);
		}
		return lecturerToUpdate;
	}
	
	public Lecturer updateLecturer( Lecturer lecturer ) {
		Lecturer lecturerToUpdate =  lecturerRepository.findById(lecturer.getId()).get();
		
		if(lecturerToUpdate != null) {
			lecturerToUpdate.setDepartment(lecturer.getDepartment());
			lecturerToUpdate.setName(lecturer.getName());
			lecturerToUpdate = lecturerRepository.save(lecturerToUpdate);
		}
		return lecturerToUpdate;
	}
}
