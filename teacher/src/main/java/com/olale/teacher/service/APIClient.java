package com.olale.teacher.service;


import com.olale.teacher.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8080", value = "DEPARTMENT-MICROSERVICE")
@FeignClient(name = "department-microservice")
public interface APIClient {
    @GetMapping("api/departments/{department-code}")
    DepartmentDto getDepByCode(@PathVariable("department-code") String departmentCode);
}