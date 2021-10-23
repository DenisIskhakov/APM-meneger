package com.example.apmmeneger.enumExample;

//Решение состоит из статуса
public enum Solutions {
    APPROVED, NOT_APPROVED;

    public String toString(){
        return this.name().toLowerCase();
    }
    public static Solutions from(String solutions){
        return Solutions.valueOf(solutions.toUpperCase());
    }

}