package com.Calculadora.geografica.Controller;

import com.Calculadora.geografica.Model.ClassificarModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/classificar")
public class ClassificarController {
    @PostMapping
    @ResponseBody
    public List<ClassificarModel> Classificar( @RequestBody List<ClassificarModel> Lista) {
        for (ClassificarModel item: Lista){
            item.ClassificarAgua();
            System.out.println("classificando agua " + item);
        }
    return Lista;
    }

}
