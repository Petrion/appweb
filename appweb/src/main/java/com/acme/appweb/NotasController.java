package com.acme.appweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotasController {
    // get obter dados de uma array
    @GetMapping("/notas")
    public String [] listar(){
        String[] notas = new String[]{"Nota 1","Nota 2"};
        return notas;
    }

}
