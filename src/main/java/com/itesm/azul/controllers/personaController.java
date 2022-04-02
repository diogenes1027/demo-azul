package com.itesm.azul.controllers;

import com.itesm.azul.models.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/persona")
public class personaController {

    @GetMapping("/perfil")
    public Persona getPerfil() {
        Persona p = new Persona();
        p.setNombre("Diosgenes");
        p.setEdad(20);
        return p;
    }

    @GetMapping("/rodo")
    public String getRodo(){
        return "tqm, rodo <3 ᘛ⁐̤ᕐᐷ";
    }


}
