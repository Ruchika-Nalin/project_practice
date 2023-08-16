package com.ruchi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ruchi.dto.EmployeeDto;
import com.ruchi.entity.EmployeeEntity;
import com.ruchi.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl empService;
	
	@GetMapping("/employees")
	public ResponseEntity<List<EmployeeEntity>> getEmployeeList(){
		List<EmployeeEntity> allEmployee = empService.getAllEmployee();
		return new ResponseEntity<> (allEmployee,HttpStatus.OK);
	}

@PostMapping("/employee")
public ResponseEntity<String> saveEmpDetails(@RequestBody EmployeeDto employeeDto){
	boolean isSave = empService.saveEmployeeDetails(employeeDto);
	if(isSave) {
	 return new ResponseEntity<> ("Details are saved successfully",HttpStatus.CREATED);
	}
	return new ResponseEntity<> ("Details are saved successfully",HttpStatus.BAD_REQUEST);
	
	
}
}
