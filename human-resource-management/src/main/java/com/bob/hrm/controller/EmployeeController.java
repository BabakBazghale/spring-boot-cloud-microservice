package com.bob.hrm.controller;


import com.bob.hrm.model.Employee;
import com.bob.hrm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
   private EmployeeService employeeService;

    @PostMapping(value = "/persistence")
    public Boolean employeePersistence(){
        return employeeService.employeePersistence();
    }

    @GetMapping(value = "/find-by-personnel-code")
    public Employee findEmployeeByPersonnelCode(@RequestParam Integer personnelCode){
        return employeeService.findEmployeeByPersonnelCode(personnelCode);
    }

}

