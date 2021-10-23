package com.example.apmmeneger.entity;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
// Сведения о занятости:
public class Busyness {

    private String position; // должность
    private String nameOrganization; //имя организации
}
