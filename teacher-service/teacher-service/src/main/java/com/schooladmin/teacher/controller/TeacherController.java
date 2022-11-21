package com.schooladmin.teacher.controller;

import com.schooladmin.teacher.entity.Teacher;
import com.schooladmin.teacher.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Slf4j
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping
    @RequestMapping("/teachers")
    public Teacher saveTeacher(@RequestBody Teacher teacher) {
        log.info("Inside the saveTeacher of TeacherController");
        return teacherService.saveTeacher(teacher);
    }

    @GetMapping
    @RequestMapping("/teachers/{email}")
    public Teacher registerindTeacherByEmail(@PathVariable("email") String email) {
        return teacherService.findTeacherByEmail(email);
    }

    @GetMapping
    @RequestMapping("/register")
    public Teacher registerStudent(@RequestBody StudentRegisterDto  studentRegisterDto) {

        return teacherService.findTeacherByEmail(email);
    }

}
