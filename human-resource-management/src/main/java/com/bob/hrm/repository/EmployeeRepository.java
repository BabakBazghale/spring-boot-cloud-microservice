package com.bob.hrm.repository;

import com.bob.hrm.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

    boolean existsByPersonnelCode(Integer personnelCode);

    Employee findByPersonnelCode(Integer personnelCode);
}
