package br.com.pinho.cursos.java.oo.exemplo.service.impl;

import br.com.pinho.cursos.java.oo.exemplo.model.Conta;
import br.com.pinho.cursos.java.oo.exemplo.utils.ValidarSenha;

import java.math.BigDecimal;

public class TrasferenciaInterna {

    private final ValidarSenha validaSenha;

    public TrasferenciaInterna(ValidarSenha validaSenha) {
        this.validaSenha = validaSenha;
    }

    public Conta execute(Conta origem, Conta destino, BigDecimal valor, String senha) {
        if (validaSenha.execute(origem, senha)) {
            transfereDinheiro(origem, valor, destino);
            System.out.println("Mensagem de integração com sistema de transferência interna");
        } else {
            System.out.println("Senha inválida. Tente novamente.");
        }
        return origem;
    }

    private void transfereDinheiro(Conta origem, BigDecimal valor, Conta destino) {
        if (valor.compareTo(origem.getSaldo()) > 0) {
            System.out.println("Saldo insuficiente");
        } else {
            origem.setSaldo(origem.getSaldo().subtract(valor));
            destino.setSaldo(destino.getSaldo().add(valor));
        }
    }
}
