package br.com.pinho.cursos.java.oo.exemplo.utils;

import br.com.pinho.cursos.java.oo.exemplo.model.Conta;
import br.com.pinho.cursos.java.oo.exemplo.utils.Criptografia;

public class ValidarSenha {

    public boolean execute(Conta conta, String senha) {
        return conta.getSenha().equals(Criptografia.criptografar(senha));
    }
}
