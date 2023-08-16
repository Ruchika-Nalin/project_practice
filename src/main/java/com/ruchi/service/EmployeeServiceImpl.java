package com.ruchi.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruchi.dto.EmployeeDto;
import com.ruchi.entity.EmployeeEntity;
import com.ruchi.repository.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepo empRepo;

	@Override
	public List<EmployeeEntity> getAllEmployee() {
		 List<EmployeeEntity> findAll = empRepo.findAll();
		return findAll;
		 
		
	}

	@Override
	public boolean saveEmployeeDetails(EmployeeDto employeeDto) {
	
		EmployeeEntity employeeEntity=new EmployeeEntity();
		BeanUtils.copyProperties(employeeDto, employeeEntity);
		EmployeeEntity save = empRepo.save(employeeEntity);
	
		return save.getId()!=null;
	}

}
