package com.edu.sandbox.weather.domain.deserializer;

import com.fasterxml.jackson.databind.util.StdConverter;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateConverter extends StdConverter<Long, LocalDateTime> {

    @Override
    public LocalDateTime convert(Long value) {
        return Instant.ofEpochSecond(value).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

}
