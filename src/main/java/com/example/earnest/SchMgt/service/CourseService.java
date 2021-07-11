package com.example.earnest.SchMgt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.earnest.SchMgt.model.Course;
import com.example.earnest.SchMgt.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;
	
	public Course createCourse(Course course) {
		return courseRepository.save(course);
	}

	public List<Course> getCourses(){
		Iterable<Course> cI =courseRepository.findAll();
		List <Course> courses = new ArrayList<Course>();
		cI.forEach((course) -> courses.add(course));
		
		return courses;
	}
	
	public Course getCourseById(String id) {
		Optional<Course> cO = courseRepository.findById(id);
		if(cO.isPresent()) {
			return cO.get();
			
		}
		return null;
	}
	
	public void deleteCourse(Course course) {
		if(course != null)
		courseRepository.delete(course);
	}
	
	public void deleteCourseById(String id) {
		courseRepository.deleteById(id);
		
	}
	
	public Course updateCourseById(String id, Course course) {
		Course courseToUpdate =  courseRepository.findById(id).get();
		
		if(courseToUpdate != null) {
			courseToUpdate.setDepartment(course.getDepartment());
			courseToUpdate.setName(course.getName());
			courseToUpdate.setLecturer(course.getLecturer());
			
			courseToUpdate = courseRepository.save(courseToUpdate);
		}
		return courseToUpdate;
	}
	
	public Course updateCourse(Course course) {
		Course courseToUpdate =  courseRepository.findById(course.getId()).get();
		
		if(courseToUpdate != null) {
			courseToUpdate.setDepartment(course.getDepartment());
			courseToUpdate.setName(course.getName());
			courseToUpdate.setLecturer(course.getLecturer());
			
			courseToUpdate = courseRepository.save(courseToUpdate);
		}
		return courseToUpdate;
	}
}
