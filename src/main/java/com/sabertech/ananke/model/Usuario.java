package com.sabertech.ananke.model;

import com.sabertech.ananke.model.util.Perfil;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Perfil perfil;

    private String matricula;

    private String tokenAcesso;
}
