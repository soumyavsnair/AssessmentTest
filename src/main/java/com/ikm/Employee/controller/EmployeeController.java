package com.ikm.Employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ikm.Employee.model.EmployeeModel;
import com.ikm.Employee.repository.EmployeeRepository;
import com.ikm.Employee.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

  @Autowired  
  EmployeeService employeeService;


@PostMapping("/employees")
public  ResponseEntity<Long>  createEmployee(@RequestBody EmployeeModel request) {
		long id= employeeService.createEmployee(request);
    return new ResponseEntity<>(id, HttpStatus.CREATED);
     
	}
    
}
