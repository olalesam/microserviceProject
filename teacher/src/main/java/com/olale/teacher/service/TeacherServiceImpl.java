package com.olale.teacher.service;

import com.olale.teacher.dto.APIResponseDto;
import com.olale.teacher.dto.DepartmentDto;
import com.olale.teacher.dto.TeacherDto;
import com.olale.teacher.entities.Teacher;
import com.olale.teacher.repo.TeacherRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@AllArgsConstructor
@Service
public class TeacherServiceImpl  implements TeacherService {

    private TeacherRepository teacherRepository;
    private WebClient webClient;
    @Override
    public APIResponseDto getTeacherById(Long id) {
        Teacher teacher = teacherRepository.findById(id).get();
        DepartmentDto departmentDto = webClient.get()
                .uri("http://localhost:8080/api/departments/" +
                        teacher.getDepCode())
                .retrieve()
                .bodyToMono(DepartmentDto.class)
                .block();
        TeacherDto teacherDto = new TeacherDto(
                teacher.getId(),
                teacher.getFirstName(),
                teacher.getLastName(),
                teacher.getDepCode()
        );
        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setTeacherDto(teacherDto);
        apiResponseDto.setDepartmentDto(departmentDto);
        return apiResponseDto;
    }
}
