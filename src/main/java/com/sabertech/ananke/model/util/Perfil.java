package com.sabertech.ananke.model.util;

public enum Perfil {
    ALUNO(1),
    PROFESSOR(2),
    COORDENADOR(3),
    ADMINISTRADOR(4);

    private int perfil;

    Perfil(int perfil){
        this.perfil = perfil;
    }

    public int getPerfil(){
        return this.perfil;
    }
}