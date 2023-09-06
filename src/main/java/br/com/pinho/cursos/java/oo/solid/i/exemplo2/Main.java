package br.com.pinho.cursos.java.oo.solid.i.exemplo2;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bem vindo.");
        System.out.println("Fase 1. Aves...");
        Ave falcao = new Falcao();
        Ave pinguim = new Pinguim();

        System.out.println("Jogador pulo!");
        // if jogador pula
        falcao.voar(10);
        pinguim.voar(0);
    }
}
