package com.example.crud.Controller;


import com.example.crud.Model.Employee;
import com.example.crud.Repository.EmployeeRepository;
import com.example.crud.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;


    @PostMapping("/addemployee")
    public Employee postDetails(@RequestBody Employee employee){
        return employeeService.saveDetails(employee);
    }

    @GetMapping("/getemployee")
    public List<Employee> getdetails(){
        return employeeService.getall();
    }

    @PutMapping("/updateemployee")
    private Employee updateDetails(@RequestBody Employee employee){
        return employeeService.updateDetails(employee);
    }

    @DeleteMapping("/deleteemployee/{id}")
    private String deleteDetails(@PathVariable int id){
        return employeeService.deleteDetails(id);
    }
}
