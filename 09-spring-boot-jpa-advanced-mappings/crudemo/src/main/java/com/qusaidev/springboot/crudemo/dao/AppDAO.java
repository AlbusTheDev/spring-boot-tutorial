package com.qusaidev.springboot.crudemo.dao;

import com.qusaidev.springboot.crudemo.entity.Instructor;
import com.qusaidev.springboot.crudemo.entity.InstructorDetail;

public interface AppDAO {

    void save(Instructor instructor);

    Instructor findInstructorById(int id);

    void deleteInstructorById(int id);

    InstructorDetail findInstructorDetailById(int id);
}
