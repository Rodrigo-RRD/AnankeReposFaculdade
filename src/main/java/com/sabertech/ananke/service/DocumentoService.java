package com.sabertech.ananke.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabertech.ananke.model.Documento;
import com.sabertech.ananke.repository.DocumentoRepository;

@Service
public class DocumentoService {

    @Autowired
    private DocumentoRepository documentoRepository;
    
    public Documento salvarDoc(Documento doc) {
        return documentoRepository.save(doc);
    }

    public List<Documento> listaDeDocumento(){
        return documentoRepository.findAll();
    }
    
}
