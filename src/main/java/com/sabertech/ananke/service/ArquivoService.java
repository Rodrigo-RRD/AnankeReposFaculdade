package com.sabertech.ananke.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabertech.ananke.model.Arquivo;
import com.sabertech.ananke.repository.ArquivoRepository;

@Service
public class ArquivoService {
    
    @Autowired
    ArquivoRepository arquivoRepository;

    public List<Arquivo> listDeArquivos(){
        return arquivoRepository.findAll();
    } 

    public Arquivo salvar(Arquivo arquivo){
        arquivo.setData(new Date());
        return arquivoRepository.save(arquivo);
    }
}
