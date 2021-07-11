package com.example.earnest.SchMgt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.earnest.SchMgt.model.Department;
@Repository
public interface DepartmentRepository extends CrudRepository <Department, String>{

}
