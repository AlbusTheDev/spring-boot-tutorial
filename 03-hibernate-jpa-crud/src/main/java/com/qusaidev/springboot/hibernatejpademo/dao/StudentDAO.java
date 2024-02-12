package com.qusaidev.springboot.hibernatejpademo.dao;

import com.qusaidev.springboot.hibernatejpademo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save (Student student);
    Student findById(int id);

    List<Student> findAll();
}