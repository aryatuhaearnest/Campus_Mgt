package com.example.earnest.SchMgt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.earnest.SchMgt.model.Course;
@Repository
public interface CourseRepository extends CrudRepository< Course, String>{

}
