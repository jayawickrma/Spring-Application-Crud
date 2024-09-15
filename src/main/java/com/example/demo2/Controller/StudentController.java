package com.example.demo2.Controller;

import com.example.demo2.DTO.IMPL.Student;
import com.example.demo2.Service.StudntService;
import com.example.demo2.Utill.AppUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v2/student")
public class StudentController {
    @Autowired
    public StudntService Studentservice;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Student saveStudent(Student student){
        student.setName(AppUtill.generateStudentID());
        return student;
    }

}
