package com.bob.finance.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity(name = "stockItem")
@Table(name = "stockItem")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class StockItem implements Serializable {


    private static final long serialVersionUID = -202386662024065226L;
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String company;

    private String market;

    private Integer rank;

    private Double price;
}
