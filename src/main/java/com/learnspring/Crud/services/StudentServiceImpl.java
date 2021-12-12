package com.learnspring.Crud.services;

import com.learnspring.Crud.entities.Student;
import com.learnspring.Crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        Student temp = studentRepository.findById(id).get();
        if(student.getStudentName() != null){
            temp.setStudentName(student.getStudentName());
        }
        if(student.getStudentDepartment() != null){
            temp.setStudentDepartment(student.getStudentDepartment());
        }
        if(student.getStudentGPA() != 0){
            temp.setStudentGPA(student.getStudentGPA());
        }
        return studentRepository.save(temp);
    }
}
