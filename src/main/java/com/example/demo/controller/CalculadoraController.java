package com.example.demo.controller;

import com.example.demo.dto.InputDto;
import com.example.demo.service.ICalculadoraService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculadoraController {

    ICalculadoraService calculadoraService;
    
    public CalculadoraController(ICalculadoraService calculadoraService){
        this.calculadoraService = calculadoraService;
    }

    @PostMapping("sumar")
    public double sumar(@RequestBody InputDto input){
        return calculadoraService.sumar(input.getOperando1().doubleValue(), input.getOperando2().doubleValue());
    }

    @GetMapping("restar/{operando1}/{operando2}")
    public double restar(@PathVariable double operando1, @PathVariable double operando2){
        return calculadoraService.restar(operando1,operando2);
    }
}
