package com.sabertech.ananke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/doc")
@CrossOrigin("origins = *")
@Controller
public class DocumentoController {

    @GetMapping
    public String doc() {
        return "index";
    }
    
}
