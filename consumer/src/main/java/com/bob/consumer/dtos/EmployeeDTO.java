package com.bob.consumer.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class EmployeeDTO {

    private Long id;

    private String username;

    private String gender;

    private String position;

    private Integer personnelCode;
}
