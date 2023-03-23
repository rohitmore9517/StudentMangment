package com.empmanagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.empmanagment.entity.Employee;
import com.empmanagment.service.EmpService;

@RestController
public class Controller {

	@Autowired
	public EmpService empSrevice;
	
	
	@GetMapping("/getAll")
	List<Employee> getAll(){
		
		List list=(List)this.empSrevice.allEmployee();
		
		return list;
	}
	@PostMapping("/addDeta")
	public Employee AddEmp(@RequestBody Employee emp) {
		
		Employee employee=this.empSrevice.addDeta(emp);
		return employee;

	}
	@GetMapping("/getById/{id}")
	public void findbyId(int id) {
		
		this.empSrevice.FindbyId(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteId(@PathVariable ("id") int id) {
		
		this.empSrevice.deleteById(id);
	}
	
	@PutMapping("/update/{id}")
	public void Update(@PathVariable("id")int id, @RequestBody Employee emp) {
		
		this.empSrevice.update(emp, id);
	}
	 
}
