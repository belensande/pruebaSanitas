package com.example.demo.service;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public interface ICalculadoraService {
    BigDecimal sumar(@NotNull BigDecimal operando1, @NotNull BigDecimal operando2);
    BigDecimal restar(@NotNull BigDecimal operando1, @NotNull BigDecimal operando2);
}
