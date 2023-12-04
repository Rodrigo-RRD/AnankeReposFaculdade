package com.sabertech.ananke.model.orientacao;

import com.sabertech.ananke.model.Usuario;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class Orientacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Usuario orientador;
}
