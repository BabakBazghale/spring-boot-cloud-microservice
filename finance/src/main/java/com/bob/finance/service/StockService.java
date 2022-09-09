package com.bob.finance.service;

import com.bob.finance.common.exception.StockNotFoundException;
import com.bob.finance.model.StockItem;
import com.bob.finance.repository.StockItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StockService {
    @Autowired
    private StockItemRepository stockItemRepository;

    @Transactional
    public Boolean stockGeneration() {
        Boolean stockExistence = stockItemRepository.existsByName("AMZN");
        if (!stockExistence) {
            StockItem stockItem = StockItem.builder()
                    .name("AMZN")
                    .company("Amazon")
                    .market("forex")
                    .rank(1)
                    .price(2.5d)
                    .build();
            stockItemRepository.save(stockItem);
        }
        return stockExistence.equals(true) ? false : true;
    }

    public StockItem findStocksByName(String name) {
        StockItem stockItem = stockItemRepository.findByName(name);
        if (stockItem == null) {
            throw new StockNotFoundException("Stock Not Found.");
        }
        return stockItem;
    }


}
