package br.com.pinho.cursos.java.oo.solid.l.errado;

public class Quadrado extends Retangulo {

    @Override
    public void setAltura(double altura) {
        super.setAltura(altura);
        super.setBase(altura);
    }

    @Override
    public void setBase(double base) {
        super.setBase(base);
        super.setAltura(base);
    }
}
