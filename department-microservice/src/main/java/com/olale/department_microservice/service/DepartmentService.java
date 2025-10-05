package com.olale.department_microservice.service;

import com.olale.department_microservice.dto.DepartmentDto;
import com.olale.department_microservice.entities.Department;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {
     DepartmentDto findByDepCode(String code);
}
