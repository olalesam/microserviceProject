package com.olale.department_microservice.controller;

import com.olale.department_microservice.dto.DepartmentDto;
import com.olale.department_microservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/departments")
@AllArgsConstructor
public class DepartmentController {
    private DepartmentService departmentService;
    @GetMapping("{code}")
    public ResponseEntity<DepartmentDto> getDepByCode(@PathVariable String code) {
        return ResponseEntity.ok(departmentService.findByDepCode(code));
    }
}
