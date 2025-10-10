package com.olale.teacher.service;


import com.olale.teacher.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8080", value = "DEPARTMENT-MICROSERVICE")
public interface APIClient {
    @GetMapping("api/department s/{department-code}")
    DepartmentDto getDepByCode(@PathVariable("department-code") String departmentCode);
}