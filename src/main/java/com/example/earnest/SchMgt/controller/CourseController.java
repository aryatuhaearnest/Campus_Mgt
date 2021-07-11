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

import com.example.earnest.SchMgt.model.Course;
import com.example.earnest.SchMgt.service.CourseService;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseService; 
	
	
	@PostMapping("/create")
	public Course createCourse(@RequestBody Course course) {
		return courseService.createCourse(course);
	}
	@GetMapping("/courses")
	public List<Course> getCourses() {
		return courseService.getCourses();
	}
	
	@GetMapping("/courses/id")
	public Course getCourseById(@PathVariable String id){
		return courseService.getCourseById(id);
	}
	@DeleteMapping("/course")
	public void deleteCourse(@RequestBody Course course) {
		courseService.deleteCourse(course);
	}
	@DeleteMapping("/course/id")
	public void deleteCourseById(@PathVariable String id) {
		courseService.deleteCourseById(id);
	}
	@PutMapping("/course")
	public Course updateCourse(@RequestBody Course course) {
		return courseService.updateCourse(course);
	}
	@PutMapping("/course/{id}")
	public Course updateCourseById(@RequestBody Course course, @PathVariable String id) {
		return courseService.updateCourseById(id, course);
	}
	
}
