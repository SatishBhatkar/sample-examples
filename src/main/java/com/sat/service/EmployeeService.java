package com.sat.service;

import com.sat.DTO.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public Employee getEmployee(){
        Employee employee=new Employee();
        employee.setName("Satish");
        employee.setLastName("Bhatkar");
        return employee;
        //throw new RuntimeException(" Testing for Exception");


    }
}
