package com.sat.controller;

import com.sat.DTO.Employee;
import com.sat.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/employee"  ,method = RequestMethod.GET,produces = "application/josn")

     public Employee getEmployee(){

        return  employeeService.getEmployee();
        
    }
}
