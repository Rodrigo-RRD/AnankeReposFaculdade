package com.sabertech.ananke.model.util;

public enum AreaConhecimento {
    CIENCIAS_EXATAS("Ciências Exatas"),
    SAUDE("Saúde"),
    OUTRAS("Outras áreas");

    private String area;

    AreaConhecimento(String area){
        this.area = area;
    }

    public String getArea(){
        return this.area;
    }
}
