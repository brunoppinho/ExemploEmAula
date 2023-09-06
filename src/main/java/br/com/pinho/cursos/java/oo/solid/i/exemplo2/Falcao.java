package br.com.pinho.cursos.java.oo.solid.i.exemplo2;

public class Falcao implements Ave {
    @Override
    public int bicar() {
        return 10;
    }

    @Override
    public void voar(int altura) {
        altura = 10;
    }
}
