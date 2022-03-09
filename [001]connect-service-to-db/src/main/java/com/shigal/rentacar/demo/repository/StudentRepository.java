package com.shigal.rentacar.demo.repository;


import com.shigal.rentacar.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
