package com.sabertech.ananke.model.util;

public enum StatusProjeto {
    EM_ANDAMENTO(1),
    CONCLUIDO(2),
    CANCELADO(3);

    private int status;

    StatusProjeto(int status){
        this.status = status;
    }

    public int getStatus(){
        return this.status;
    }
}
