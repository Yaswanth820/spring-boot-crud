package com.learnspring.Crud.controllers;

import com.learnspring.Crud.entities.Student;
import com.learnspring.Crud.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("students/{id}")
    public Student getStudentInfo(@PathVariable("id") Long id){
        return studentService.getStudentInfo(id);
    }

    @DeleteMapping("students/{id}")
    public String deleteStudent(@PathVariable("id") Long id){
        return studentService.deleteStudent(id);
    }
}
