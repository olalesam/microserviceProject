package com.olale.teacher.repo;

import com.olale.teacher.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
