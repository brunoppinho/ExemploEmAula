package br.com.pinho.cursos.java.oo.solid.i.exemplo2.correcao;

public class Pato extends AveAtacante implements Voar, Nadar {

    @Override
    public int bicar() {
        return 0;
    }

    @Override
    public void nada() {

    }

    @Override
    public int voar() {
        return 0;
    }
}
