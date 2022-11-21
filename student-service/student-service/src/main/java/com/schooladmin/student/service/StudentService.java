package com.schooladmin.student.service;

import com.schooladmin.student.entity.Student;
import com.schooladmin.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student findStudentByEmail(String email) {
        return studentRepository.findStudentByEmail(email);
    }
}
