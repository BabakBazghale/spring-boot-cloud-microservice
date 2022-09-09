package com.bob.consumer.proxies.finance;

import com.bob.consumer.dtos.StockDTO;
import com.bob.consumer.proxies.finance.fallback.StockProxyFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "zuul-server",fallback = StockProxyFallBack.class)
public interface StockProxy {

    @PostMapping(value = "/microservice-finance/stock/generation")
    Boolean stockGeneration();

    @GetMapping( value = "/microservice-finance/stock/find-by-name")
    StockDTO findStocksByName(@RequestParam  String name);
}
