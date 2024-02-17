package com.qusaidev.springboot.cruddemo.service;

import com.qusaidev.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

}
