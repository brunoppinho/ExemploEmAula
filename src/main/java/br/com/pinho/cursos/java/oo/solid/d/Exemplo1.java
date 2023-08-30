package br.com.pinho.cursos.java.oo.solid.d;

public class Exemplo1 {

    public static void main(String[] args) {
        RoboCortadorDePizza roboCortadorDePizza = new RoboCortadorDePizza();
        roboCortadorDePizza.setObjetoCortante(new CortadorDePizza());

        roboCortadorDePizza.cortar("mussarela");
    }
}
