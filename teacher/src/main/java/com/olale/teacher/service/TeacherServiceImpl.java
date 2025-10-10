package com.olale.teacher.service;

import com.olale.teacher.dto.TeacherDto;
import com.olale.teacher.entities.Teacher;
import com.olale.teacher.repo.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@RequiredArgsConstructor
@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    @Override
    public TeacherDto getTeacherById(Long id) {
        Teacher teacher = teacherRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Teacher not found with id " + id));

        return new TeacherDto(
                teacher.getId(),
                teacher.getFirstName(),
                teacher.getLastName()
        );
    }
}
