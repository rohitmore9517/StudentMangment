package com.empmanagment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empmanagment.entity.Employee;
import com.empmanagment.repository.EmpRepository;

@Service
public class EmpService {

	@Autowired
	private EmpRepository empRepository;
	
	
	public List<Employee>allEmployee(){
		
		List list=(List)this.empRepository.findAll();
		
		return list;
	}
	
	public Employee addDeta(Employee employee) {
		
		Employee emolpyee=this.empRepository.save(employee);
		return employee;
		
	}
	
	public Optional<Employee> FindbyId(int id) {
		
		Optional<Employee> emp=this.empRepository.findById(id);
		 return emp;
		 
	     
   	}
	public void deleteById(int id) {
		
		    this.empRepository.deleteById(id);
		
		
	}
	
	public void update(Employee emp ,int id) {
		
		emp.setIn(id);
		this.empRepository.save(emp);
		
	}
	
}
