package com.shigal.rentacar.demo.service;

import com.shigal.rentacar.demo.model.Student;

public interface StudentService {
    Student save(Student student);
    Student fetchStudentById(int id);
}
