package com.sabertech.ananke.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Documentos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private byte dados;

    private Date data;

    private Boolean isVersaoAluno;

    private String titulo;

    private String resumo;
    
    private Double avaliacao;


}
