package com.example.apmmeneger.enumExample;

//Работающий, не работающий (пенсионер)
public enum RetireesWorking {
    WORKING, NOT_WORKING;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
    public static RetireesWorking from(String retireesWorking){
        return RetireesWorking.valueOf(retireesWorking.toUpperCase());
    }
}
