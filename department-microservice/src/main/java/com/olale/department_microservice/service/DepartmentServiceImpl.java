package com.olale.department_microservice.service;

import com.olale.department_microservice.dto.DepartmentDto;
import com.olale.department_microservice.entities.Department;
import com.olale.department_microservice.repos.DepartmentRepository;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;

@ToString
@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto findByDepCode(String code) {
        Department dep = departmentRepository.findByDepCode(code);
        if (dep == null) {
            throw new IllegalArgumentException("Department not found for code: " + code);
        }
        return new DepartmentDto(dep.getId(), dep.getDepName(), dep.getDepCode());
    }
}
