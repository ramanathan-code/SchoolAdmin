package com.schooladmin.teacher.service;

import com.schooladmin.teacher.entity.Teacher;
import com.schooladmin.teacher.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Teacher findTeacherByEmail(String email) {
        return teacherRepository.findTeacherByEmail(email);
    }
}
