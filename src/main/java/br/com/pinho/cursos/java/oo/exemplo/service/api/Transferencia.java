package br.com.pinho.cursos.java.oo.exemplo.service.api;

import br.com.pinho.cursos.java.oo.exemplo.model.Conta;

import java.math.BigDecimal;

public interface Transferencia {

    Conta execute(Conta origem, Conta destino, BigDecimal valor, String senha);

}
