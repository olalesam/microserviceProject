package com.olale.department_microservice.controller;

import com.olale.department_microservice.config.Configuration;
import com.olale.department_microservice.dto.DepartmentDto;
import com.olale.department_microservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    private DepartmentService departmentService;


    @Value("${build.version}")
    private String buildVersion;

    @Autowired
    private Configuration configuration;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("{code}")
    public ResponseEntity<DepartmentDto> getDepByCode(@PathVariable String code) {
        return ResponseEntity.ok(departmentService.findByDepCode(code));
    }

    @GetMapping("/version")
    public ResponseEntity<String> version()
    {
        return ResponseEntity.status(HttpStatus.OK).body(buildVersion);
    }

    @GetMapping("/author")
    public ResponseEntity<String> retrieveAuthorInfo() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(configuration.getName()+" "+configuration.getEmail() );
    }
}
