package com.learnspring.Crud.services;

import com.learnspring.Crud.entities.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);

    Student getStudentInfo(Long id);

    String deleteStudent(Long id);

}
