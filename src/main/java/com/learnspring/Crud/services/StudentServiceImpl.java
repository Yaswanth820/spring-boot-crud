package com.learnspring.Crud.services;

import com.learnspring.Crud.entities.Student;
import com.learnspring.Crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentInfo(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public String deleteStudent(Long id) {
        Student s = studentRepository.findById(id).get();
        studentRepository.deleteById(id);
        return s.toString();
    }

    @Override
    public Student updateStudentInfo(Long id, Student student) {
        Student depDB = studentRepository.findById(id).get();

        if(Objects.nonNull(student.getStudentName()) && !"".equalsIgnoreCase(student.getStudentName())) {
            depDB.setStudentName(student.getStudentName());
        }

        if(Objects.nonNull(student.getStudentDepartment()) && !"".equalsIgnoreCase(student.getStudentDepartment())) {
            depDB.setStudentDepartment(student.getStudentDepartment());
        }

        if(Objects.nonNull(student.getStudentGPA())) {
            depDB.setStudentGPA(student.getStudentGPA());
        }

        return studentRepository.save(depDB);
    }
}
