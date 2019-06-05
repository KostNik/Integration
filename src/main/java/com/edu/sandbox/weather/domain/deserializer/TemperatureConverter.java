package com.edu.sandbox.weather.domain.deserializer;

import com.fasterxml.jackson.databind.util.StdConverter;

public class TemperatureConverter extends StdConverter<String, Float> {

    private static final int ZERO = 273;

    @Override
    public Float convert(String value) {
        float tempKelvins = Float.parseFloat(String.valueOf(value));
        return tempKelvins - ZERO;
    }

//    @Override
//    public JavaType getInputType(TypeFactory typeFactory) {
//        return TypeFactory.defaultInstance().constructType(Float.TYPE);
//    }
//
//    @Override
//    public JavaType getOutputType(TypeFactory typeFactory) {
//        return TypeFactory.defaultInstance().constructType(String.class);
//    }
}
