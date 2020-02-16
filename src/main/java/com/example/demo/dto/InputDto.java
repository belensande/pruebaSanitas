package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@EqualsAndHashCode
@ToString
@Getter
@AllArgsConstructor
public class InputDto {
    private final BigDecimal operando1;
    private final BigDecimal operando2;
}
