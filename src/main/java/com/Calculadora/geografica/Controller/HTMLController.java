package com.Calculadora.geografica.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTMLController {
    @GetMapping("/")
    public String index() {
        return "index"; // Isso retorna o nome do arquivo HTML (sem extensão)
    }
}
