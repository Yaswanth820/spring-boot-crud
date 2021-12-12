package com.learnspring.Crud.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;
    private String studentName;
    private String studentDepartment;
    private float studentGPA;

    public Student() {
    }

    public Student(String studentName, String studentDepartment, float studentGPA) {
        this.studentName = studentName;
        this.studentDepartment = studentDepartment;
        this.studentGPA = studentGPA;
    }

    public Student(Long studentId, String studentName, String studentDepartment, float studentGPA) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentDepartment = studentDepartment;
        this.studentGPA = studentGPA;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }

    public float getStudentGPA() {
        return studentGPA;
    }

    public void setStudentGPA(float studentGPA) {
        this.studentGPA = studentGPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentDepartment='" + studentDepartment + '\'' +
                ", studentGPA=" + studentGPA +
                '}';
    }
}
