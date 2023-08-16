package com.ruchi.service;

import java.util.List;


import com.ruchi.dto.EmployeeDto;
import com.ruchi.entity.EmployeeEntity;

public interface EmployeeService {
	public List<EmployeeEntity> getAllEmployee();
	
	public boolean saveEmployeeDetails( EmployeeDto dto );
	
	

}
