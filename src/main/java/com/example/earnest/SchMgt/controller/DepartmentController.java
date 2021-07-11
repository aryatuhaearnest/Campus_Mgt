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

import com.example.earnest.SchMgt.model.Department;
import com.example.earnest.SchMgt.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
 private DepartmentService departmentService;
	
//	@PostMapping("/department")
//	public Department createDepartment(@RequestBody Department department) {
//	return 	departmentService.createDepartment(department);
//	}
//	
//	@GetMapping("/departments")
//	public List<Department> getDepartments(){
//		return departmentService.getDeparments();
//	}
//	
//	@GetMapping("/department/{id}")
//	public Department getById(@PathVariable("id") String id) {
//		
//		return departmentService.getById(id);
//	}
//	
//	@DeleteMapping("/department")
//	public void deleteDepartment(@RequestBody Department department) {
//		departmentService.deleteDepartment(department);
//	}
//	
//	@DeleteMapping("/department/{id}")
//	public void deleteDepartmentById(@PathVariable("id") String id) {
//		departmentService.deleteDepartmentById(id);
//	}
//	
//	@PutMapping("/department/{id}")
//	public Department updateDepartmentById(@PathVariable("id") String id , @RequestBody Department department )  {
//			return departmentService.updateDepartmentById(id, department);
//	}
}
