package com.olale.teacher.controller;

import com.olale.teacher.dto.APIResponseDto;
import com.olale.teacher.dto.TeacherDto;
import com.olale.teacher.entities.Teacher;
import com.olale.teacher.repo.TeacherRepository;
import com.olale.teacher.service.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/teachers")
@AllArgsConstructor
public class TeacherController {
    private TeacherService teachersService;
    private final TeacherRepository repo;
    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getTeacherById(@PathVariable("id")
                                                         Long id )
    {
        return new ResponseEntity<APIResponseDto>(teachersService.getTeacherById(id), HttpStatus.OK);
    }
    @GetMapping("/all")
    public List<Teacher> all() { return repo.findAll();}

    @GetMapping("/deleteAll")
    public  void delete() {
        repo.deleteAll();
    }
}