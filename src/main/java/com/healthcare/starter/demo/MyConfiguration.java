package com.healthcare.starter.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MyConfiguration {

    private final String value1;
    private final int value2;
    private final boolean value3;
    @Getter(value = AccessLevel.NONE)
    private final ObjectMapper objectMapper;

}
