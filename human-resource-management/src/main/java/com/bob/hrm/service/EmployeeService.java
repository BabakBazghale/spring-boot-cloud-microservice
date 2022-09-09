package com.bob.hrm.service;

import com.bob.hrm.common.EmployeeNotFoundException;
import com.bob.hrm.model.Employee;
import com.bob.hrm.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public Boolean employeePersistence() {
        Boolean employeeExistence = employeeRepository.existsByPersonnelCode(173931);
        if (!employeeExistence) {
            Employee employee = Employee.builder()
                    .gender("male")
                    .personnelCode(173931)
                    .position("developer")
                    .username("peter").build();
            employeeRepository.save(employee);
        }
        return employeeExistence.equals(true) ? false : true;
    }

    public Employee findEmployeeByPersonnelCode(Integer personnelCode) {
        Employee employee = employeeRepository.findByPersonnelCode(personnelCode);
        if (employee == null) {
            throw new EmployeeNotFoundException("Employee Not Found.");
        }
        return employee;
    }


}
