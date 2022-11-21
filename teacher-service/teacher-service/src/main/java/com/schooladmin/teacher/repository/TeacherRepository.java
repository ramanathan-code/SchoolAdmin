package com.schooladmin.teacher.repository;

import com.schooladmin.teacher.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, String> {
    Teacher findTeacherByEmail(String email);
}
