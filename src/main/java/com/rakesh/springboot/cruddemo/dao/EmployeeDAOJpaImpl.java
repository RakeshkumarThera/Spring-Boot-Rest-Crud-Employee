package com.rakesh.springboot.cruddemo.dao;

import com.rakesh.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

    //define field for entitymanager
    private EntityManager entityManager;

    @Override
    public Employee findbyId(int theId) {
        //get employee
        Employee theEmployee = entityManager.find(Employee.class, theId);

        // return employee
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        //save employee
        Employee dbEmployee = entityManager.merge(theEmployee); //if id == 0 - insert/save or update

        //return the dbEmployee
        return dbEmployee;
    }

    @Override
    public void deleteById(int theId) {
        //find the employee by id
        Employee theEmployee = entityManager.find(Employee.class, theId);

        //remove employee
        entityManager.remove(theEmployee);
    }

    //set up constructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager){  //Constructor Injection
        entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {

        //create a query;
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class); //this step is for setup and no interaction with database is happened

        //execute query anf get result list
        List<Employee> employees = theQuery.getResultList();  //this step is execution of setup query and interaction to databse happens

        //return the results
        return employees;
    }
}
