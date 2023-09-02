package br.com.pinho.cursos.java.oo.exemplo.service.impl;

import br.com.pinho.cursos.java.oo.exemplo.model.Conta;
import br.com.pinho.cursos.java.oo.exemplo.utils.ValidarSenha;

import java.math.BigDecimal;

public class TransferenciaPix {
    private final ValidarSenha validaSenha;

    public TransferenciaPix(ValidarSenha validaSenha) {
        this.validaSenha = validaSenha;
    }

    public Conta execute(Conta origem, Conta destino, BigDecimal valor, String senha) {
        if (validaSenha.execute(origem, senha)) {
            transfereDinheiro(origem, valor, destino);
            System.out.println("Mensagem de integração com sistema PIX");
        } else {
            System.out.println("Senha inválida. Tente novamente.");
        }
        return origem;
    }

    private void transfereDinheiro(Conta origem, BigDecimal valor, Conta destino) {
        if (origem.possoRetirarOValor(valor)) {
            System.out.println("Saldo insuficiente");
        } else {
            origem.setSaldo(origem.getSaldo().subtract(valor));
            destino.setSaldo(destino.getSaldo().add(valor));
        }
    }
}
