package com.bob.consumer.controller;


import com.bob.consumer.dtos.EmployeeDTO;
import com.bob.consumer.dtos.StockDTO;
import com.bob.consumer.proxies.finance.StockProxy;
import com.bob.consumer.proxies.hrm.EmployeeProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private EmployeeProxy employeeProxy;

    @Autowired
    private StockProxy stockProxy;

    @GetMapping("/stocks/find-by-name")
    public StockDTO findStocksByName(@RequestParam String name) {
        return stockProxy.findStocksByName(name);
    }

    @GetMapping("/employee/find-by-personnel-code")
    public EmployeeDTO findEmployeeByPersonnelCode(@RequestParam Integer personnelCode) {
        return employeeProxy.findEmployeeByPersonnelCode(personnelCode);
    }

    @PostMapping("/stocks/generation")
    public Boolean stockGeneration() {
        return stockProxy.stockGeneration();
    }

    @PostMapping("/employee/persistence")
    public Boolean employeePersistence() {
        return employeeProxy.employeePersistence();
    }


}
