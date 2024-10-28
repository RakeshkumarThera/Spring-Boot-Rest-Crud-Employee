package com.rakesh.springboot.cruddemo.service;

import com.rakesh.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findbyId(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);



}
