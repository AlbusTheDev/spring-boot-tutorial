package com.qusaidev.springboot.cruddemo.dao;

import com.qusaidev.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
