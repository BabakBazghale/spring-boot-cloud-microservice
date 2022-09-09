package com.bob.finance.repository;



import com.bob.finance.model.StockItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockItemRepository extends JpaRepository<StockItem, Long> {
    boolean existsByName(String name);
    StockItem findByName(String name);
}
