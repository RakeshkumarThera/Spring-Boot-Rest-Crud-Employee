package com.rakesh.springboot.cruddemo.rest;

import com.rakesh.springboot.cruddemo.dao.EmployeeDAO;
import com.rakesh.springboot.cruddemo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeDAO employeeDAO;

    //Constructor injection employee DAO
    private EmployeeRestController(EmployeeDAO theEmployeeDAO){
        employeeDAO = theEmployeeDAO;
    }

    //expose "/employees" endpoint
   @GetMapping("/employees")
    public List<Employee> findAll(){
       return employeeDAO.findAll();
    }
}
