package com.sabertech.ananke.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sabertech.ananke.model.Arquivo;
import com.sabertech.ananke.service.ArquivoService;

@RequestMapping("/arquivo")
@CrossOrigin("origins = *")
@Controller
public class ArquivoController {
    
    @Autowired
    ArquivoService arquivoService;

    @GetMapping()
    public ModelAndView listArquivo() {
        ModelAndView mv = new ModelAndView("upload");
        Iterable<Arquivo> arquivo = arquivoService.listDeArquivos();
        mv.addObject("arquivos", arquivo);
        return mv;
    }

    @PostMapping("/salvar")
    public String salvarArquivo(Arquivo arquivo) {
        arquivoService.salvar(arquivo);
        return "redirect:/arquivo";
    }

}
