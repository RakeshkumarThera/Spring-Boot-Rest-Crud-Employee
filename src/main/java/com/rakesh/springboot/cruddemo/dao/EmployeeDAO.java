package com.rakesh.springboot.cruddemo.dao;

import com.rakesh.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
