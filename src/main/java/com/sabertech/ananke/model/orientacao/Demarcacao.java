package com.sabertech.ananke.model.orientacao;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Demarcacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private float posicaoX1;
    
    private float posicaoX2;

    private float posicaoY1;

    private float posicaoY2;

    private int num_pagina;
}
