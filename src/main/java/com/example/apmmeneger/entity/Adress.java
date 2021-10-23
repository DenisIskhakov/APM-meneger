package com.example.apmmeneger.entity;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class Adress {
    private String city;
    private String street;
    private String house;
    private String apartment;
}
