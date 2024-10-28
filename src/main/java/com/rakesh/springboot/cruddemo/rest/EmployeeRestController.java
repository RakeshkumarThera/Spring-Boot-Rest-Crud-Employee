package com.rakesh.springboot.cruddemo.rest;

import com.rakesh.springboot.cruddemo.dao.EmployeeDAO;
import com.rakesh.springboot.cruddemo.entity.Employee;
import com.rakesh.springboot.cruddemo.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;

    //Constructor injection employee DAO
    private EmployeeRestController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    //expose "/employees" endpoint
   @GetMapping("/employees")
    public List<Employee> findAll(){
       return employeeService.findAll();
    }
}
