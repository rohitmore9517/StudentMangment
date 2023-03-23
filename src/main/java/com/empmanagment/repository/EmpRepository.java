package com.empmanagment.repository;

import org.springframework.data.repository.CrudRepository;

import com.empmanagment.entity.Employee;

public interface EmpRepository extends CrudRepository<Employee, Integer> {

}
