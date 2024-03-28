package com.qusaidev.springboot.crudemo.dao;

import com.qusaidev.springboot.crudemo.entity.Instructor;

public interface AppDAO {

    void save(Instructor instructor);

    Instructor findInstructorById(int id);

    void deleteInstructorById(int id);
}