package br.com.calcdemo.calculadora.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @RequestMapping(path = { "/" })
    public String home() {
        return "Welcome home!";
    }

    @RequestMapping(path = { "/ola, /saudacao" })
    public String ola() {
        return "olá Spring Boot!";
    }

    @PostMapping(path = { "/ola, /saudacao" })
    public String saudação() {
        return "olá Spring Boot!";
    }

}
