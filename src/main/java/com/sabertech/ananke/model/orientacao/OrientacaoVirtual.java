package com.sabertech.ananke.model.orientacao;



import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class OrientacaoVirtual extends Orientacao {

    private List<Recomendacao> recomendacoes;
}
