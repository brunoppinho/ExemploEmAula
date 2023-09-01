package br.com.pinho.cursos.java.oo.exemplo.service.impl;

import br.com.pinho.cursos.java.oo.exemplo.model.Conta;
import br.com.pinho.cursos.java.oo.exemplo.repository.Repository;
import br.com.pinho.cursos.java.oo.exemplo.utils.Criptografia;

public class DefinirSenha {
    private final Repository<Conta> repository;

    public DefinirSenha(Repository<Conta> repository) {
        this.repository = repository;
    }

    public Conta execute(Conta conta, String novaSenha) {
        conta.setSenha(Criptografia.criptografar(novaSenha));
        return repository.update(conta);
    }

}
