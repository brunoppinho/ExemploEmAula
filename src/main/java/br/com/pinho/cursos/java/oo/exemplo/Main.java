package br.com.pinho.cursos.java.oo.exemplo;

import br.com.pinho.cursos.java.oo.exemplo.service.CaixaEletronico;

public class Main {

    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();
        boolean continua = true;
        System.out.println("Bem vindo ao Santander");
        while (continua) {
            continua = caixaEletronico.execute();
        }
        System.out.println("Volte sempre!");
    }

}
