package com.shigal.rentacar.demo.service;

import com.shigal.rentacar.demo.model.Student;
import com.shigal.rentacar.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}
