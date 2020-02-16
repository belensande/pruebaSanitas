package com.example.demo.controller;

import com.example.demo.dto.InputDto;
import com.example.demo.service.ICalculadoraService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class CalculadoraController {

    ICalculadoraService calculadoraService;
    
    public CalculadoraController(ICalculadoraService calculadoraService){
        this.calculadoraService = calculadoraService;
    }

    @PostMapping("sumar")
    public BigDecimal sumar(@RequestBody InputDto input){
        return calculadoraService.sumar(input.getOperando1(), input.getOperando2());
    }

    @PostMapping("restar")
    public BigDecimal restar(@RequestBody InputDto input){
        return calculadoraService.restar(input.getOperando1(), input.getOperando2());
    }
}
