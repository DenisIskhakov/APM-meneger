package com.example.apmmeneger.enumExample;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RetireesWorkingConvertor implements Converter<String, RetireesWorking> {
    @Override
    public RetireesWorking convert(String retireesWorking) {
        return RetireesWorking.valueOf(retireesWorking.toUpperCase());
    }
}
