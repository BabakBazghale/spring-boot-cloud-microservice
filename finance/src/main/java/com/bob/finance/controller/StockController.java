package com.bob.finance.controller;


import com.bob.finance.model.StockItem;
import com.bob.finance.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockService stockService;


    @GetMapping(value = "/find-by-name")
    public StockItem findStocksByName(@RequestParam String name) {
        return stockService.findStocksByName(name);
    }

    @PostMapping(value = "/generation")
    public Boolean stockGeneration() {
        return stockService.stockGeneration();
    }

}

