package com.bob.consumer.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class StockDTO {

    private Long id;

    private String name;

    private String company;

    private String market;

    private Integer rank;

    private Double price;



}
