package com.example.EmployeeApplication.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @GetMapping
    public String getEmployee(){
        return "Employee details";
    }
}
