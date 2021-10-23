package com.example.apmmeneger.enumExample;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SolutionsConvertor implements Converter<String,Solutions> {

    @Override
    public Solutions convert(String solutions) {
        return Solutions.valueOf(solutions.toUpperCase());
    }
}
