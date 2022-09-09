package com.bob.consumer.proxies.finance.fallback;

import com.bob.consumer.dtos.StockDTO;
import com.bob.consumer.proxies.finance.StockProxy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class StockProxyFallBack implements StockProxy {

    @Override
    public Boolean stockGeneration() {
        return true;
    }

    @Override
    public StockDTO findStocksByName(String name) {
        return StockDTO.builder()
                .id(5l)
                .name("AMZN")
                .company("Amazon")
                .market("forex")
                .rank(1)
                .price(2.5d)
                .build();
    }
}
