package com.example.apmmeneger.entity;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class RetireesInformation {
    private String firstName;
    private String lastName;
    private String midlleName;
    private Integer born;
}
