package com.rakesh.springboot.cruddemo.dao;

import com.rakesh.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findbyId(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
