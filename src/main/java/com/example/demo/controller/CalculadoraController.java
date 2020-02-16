package com.example.demo.controller;

import com.example.demo.service.ICalculadoraService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    ICalculadoraService calculadoraService;

    public CalculadoraController(ICalculadoraService calculadoraService){
        this.calculadoraService = calculadoraService;
    }

    @GetMapping("sumar/{operando1}/{operando2}")
    public double sumar(@PathVariable double operando1, @PathVariable double operando2){
        return calculadoraService.sumar(operando1,operando2);
    }

    @GetMapping("restar/{operando1}/{operando2}")
    public double restar(@PathVariable double operando1, @PathVariable double operando2){
        return calculadoraService.restar(operando1,operando2);
    }
}
