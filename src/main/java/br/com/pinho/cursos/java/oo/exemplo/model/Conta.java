package br.com.pinho.cursos.java.oo.exemplo.model;

import java.math.BigDecimal;
import java.util.Random;

/**
 * https://github.com/brunoppinho/ExemploEmAula
 */
public class Conta {
    private int id;
    private String nomeTitular;
    private BigDecimal saldo;
    private String senha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
