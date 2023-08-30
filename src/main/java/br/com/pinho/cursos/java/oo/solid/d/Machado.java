package br.com.pinho.cursos.java.oo.solid.d;

public class Machado implements ObjetoCortante {

    @Override
    public void cortar() {
        System.out.println("Pegar o machado");
        System.out.println("Bater o machado na pizza");
    }
}
