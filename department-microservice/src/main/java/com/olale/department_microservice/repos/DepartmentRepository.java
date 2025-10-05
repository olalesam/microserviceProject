package com.olale.department_microservice.repos;


import com.olale.department_microservice.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findByDepCode(String code);
}
