package com.shigal.rentacar.demo.controller;

import com.shigal.rentacar.demo.model.Student;
import com.shigal.rentacar.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }
}
