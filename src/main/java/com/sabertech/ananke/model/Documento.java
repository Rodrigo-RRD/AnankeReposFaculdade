package com.sabertech.ananke.model;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Documento extends Arquivo {

    private String resumo;
    
    private Double avaliacao;

}
