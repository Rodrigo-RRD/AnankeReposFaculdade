package com.sabertech.ananke.model;

import com.sabertech.ananke.model.util.AreaConhecimento;
import com.sabertech.ananke.model.util.StatusProjeto;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Usuario aluno;

    private Usuario orientador;

    private List<Documento> documentos;

    private StatusProjeto status;

    private String tema;

    private AreaConhecimento areaConhecimento;
}