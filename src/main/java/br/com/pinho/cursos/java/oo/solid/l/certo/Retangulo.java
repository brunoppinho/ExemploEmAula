package br.com.pinho.cursos.java.oo.solid.l.certo;

public class Retangulo {

    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return base * altura;
    }
}
