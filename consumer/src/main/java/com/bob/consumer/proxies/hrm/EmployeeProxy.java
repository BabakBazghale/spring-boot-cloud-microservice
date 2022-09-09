package com.bob.consumer.proxies.hrm;


import com.bob.consumer.dtos.EmployeeDTO;
import com.bob.consumer.proxies.hrm.fallback.EmployeeProxyFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "zuul-server",fallback = EmployeeProxyFallBack.class)
public interface EmployeeProxy {

    @PostMapping(value = "/microservice-hrm/employee/persistence")
    Boolean employeePersistence();

    @GetMapping( value = "/microservice-hrm/employee/find-by-personnel-code")
    EmployeeDTO findEmployeeByPersonnelCode(@RequestParam Integer personnelCode);



}
