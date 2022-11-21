package com.schooladmin.student.controller;

import com.schooladmin.student.entity.Student;
import com.schooladmin.student.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@Slf4j
public class StudentController {

    private StudentService studentService;

    @PostMapping("/")
    public Student saveStudent(@RequestBody Student student) {
        log.info("Inside the saveStudent method of StudentController");
        return studentService.saveStudent(student);
    }

    @GetMapping("/{email}")
    public Student findStudentByEmail(@PathVariable("email") String email) {
        log.info("Inside the findStudentByEmail method of StudentController");
        return studentService.findStudentByEmail(email);
    }

}
