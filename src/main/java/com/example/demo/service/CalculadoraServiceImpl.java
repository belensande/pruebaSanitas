package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

@Service
public class CalculadoraServiceImpl implements ICalculadoraService {
    @Override
    public BigDecimal sumar(BigDecimal operando1, BigDecimal operando2) {
        return operando1.add(operando2, MathContext.DECIMAL64);
    }

    @Override
    public BigDecimal restar(BigDecimal operando1, BigDecimal operando2) {
        return operando1.subtract(operando2, MathContext.DECIMAL64);
    }
}
