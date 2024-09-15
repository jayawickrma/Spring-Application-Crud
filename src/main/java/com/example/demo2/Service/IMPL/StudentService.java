package com.example.demo2.Service.IMPL;

import com.example.demo2.DTO.IMPL.Student;
import com.example.demo2.Service.StudntService;
import com.example.demo2.Utill.AppUtill;

public class StudentService implements StudntService {
    public Student saveStudent(Student student){
        student.setName(AppUtill.generateStudentID());
        return student;
    }
}
