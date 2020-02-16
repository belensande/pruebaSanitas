package com.example.demo.service;

import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class CalculadoraServiceImpl implements ICalculadoraService {
    @Override
    public double sumar(double operando1, double operando2) {
        return operando1 + operando2;
    }

    @Override
    public double restar(double operando1, double operando2) {
        return operando1 - operando2;
    }
}
