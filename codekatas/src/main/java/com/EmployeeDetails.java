package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class EmployeeDetails {
    @RequestMapping(value = "/company/empdetails", method = RequestMethod.GET)
    @ResponseBody

    public void getEmployee(){
        String name="Sat";
    }
}
