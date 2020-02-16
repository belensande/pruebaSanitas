package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @GetMapping("sumar/{operando1}/{operando2}")
    public double sumar(@PathVariable double operando1, @PathVariable double operando2){
        return operando1 + operando2;
    }
}
