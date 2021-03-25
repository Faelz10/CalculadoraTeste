package br.com.calcdemo.calculadora.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculadoraController {

    @GetMapping("/somar/{a}/{b}")
    public int somar(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }

    @GetMapping("/subtrair")
    public int subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
        return a - b;

    }

    @GetMapping("/multiplicar/{a}/{b}")
    public Float multiplicar(@PathVariable Float a, @PathVariable Float b) {
        return a * b;
    }

    @GetMapping("/dividir/{a}/{b}")
    public Float dividir(@PathVariable Float a, @PathVariable Float b) {
        return a / b;

    }

}
