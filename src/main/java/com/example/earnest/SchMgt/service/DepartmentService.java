package com.example.earnest.SchMgt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.earnest.SchMgt.model.Department;
import com.example.earnest.SchMgt.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department createDepartment(Department department) {
		return departmentRepository.save(department);
	}
	
	public List <Department> getDeparments() {
		Iterable<Department> dI = departmentRepository.findAll();
		List<Department> departments=new ArrayList<Department>();
		dI.forEach((department) -> departments.add(department));
		return departments;
	}
	
	public Department getById(String id) {
		Optional<Department> dO = departmentRepository.findById(id);
	  
			if(dO.isPresent()) {
				return dO.get();
			}
		return null;
	}
	
	public void deleteDepartment(Department department) {
		if(department != null)
		departmentRepository.delete(department);
	}
	
	public void deleteDepartmentById(String id) {
		departmentRepository.deleteById(id);
	}
	
	public Department updateDepartmentById(String id, Department department) {
		Department departmentToUpdate =  departmentRepository.findById(id).get();
		
		if(departmentToUpdate != null) {
			departmentToUpdate.setName(department.getName());
			
			departmentToUpdate = departmentRepository.save(departmentToUpdate);
		}
		return departmentToUpdate;
	}
	
	
	public Department updateDepartment(Department department) {
		Department departmentToUpdate =  departmentRepository.findById(department.getId()).get();
		
		if(departmentToUpdate != null) {
			departmentToUpdate.setName(department.getName());
			
			departmentToUpdate = departmentRepository.save(departmentToUpdate);
		}
		return departmentToUpdate;
	}
	
}
