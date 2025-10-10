package com.olale.teacher.service;

import com.olale.teacher.dto.APIResponseDto;
import com.olale.teacher.dto.TeacherDto;

public interface TeacherService {
    APIResponseDto getTeacherById(Long id);
}

