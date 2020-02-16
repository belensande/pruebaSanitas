package com.example.demo.service;

import javax.validation.constraints.NotNull;

public interface ICalculadoraService {
    double sumar(@NotNull double operando1, @NotNull double operando2);
    double restar(@NotNull double operando1, @NotNull double operando2);
}
