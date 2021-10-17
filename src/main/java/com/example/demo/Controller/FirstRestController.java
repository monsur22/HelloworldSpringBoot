package com.example.demo.Controller;

import com.example.demo.responseobject.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {
    @GetMapping("/student")
    public Student index(){
        Student student = new Student();
        student.setId(1L);
        student.setName("Monsur");
        return student;
    }
}
