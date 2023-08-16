package com.ruchi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruchi.entity.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Integer> {

}
