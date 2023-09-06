package br.com.pinho.cursos.java.oo.solid.l.errado;

public class Main {

    public static void main(String[] args) {
        Retangulo retangulo = new Quadrado();
        retangulo.setBase(2);
        calcularAreaRetanguloBase2(retangulo);
    }

    public static void calcularAreaRetanguloBase2(Retangulo retangulo) {
        for (int i = 0; i < 10; i++) {
            retangulo.setBase(i);
            System.out.println("A area do retangulo é de " + retangulo.area());
        }
    }
}
