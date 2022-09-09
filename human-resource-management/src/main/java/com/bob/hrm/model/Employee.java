package com.bob.hrm.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity(name = "employee")
@Table(name = "employee")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Employee implements Serializable {

    private static final long serialVersionUID = 3270543542473718633L;

    @Id
    @GeneratedValue
    private Long id;

    private String username;

    private String gender;

    private String position;

    private Integer personnelCode;

}
