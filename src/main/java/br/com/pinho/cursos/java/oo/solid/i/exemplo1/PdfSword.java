package br.com.pinho.cursos.java.oo.solid.i.exemplo1;

public class PdfSword implements Sword {
    @Override
    public void editar() {
        throw new RuntimeException("Não pode!");
    }

    @Override
    public void salvar() {

    }

    @Override
    public void apagar() {

    }

    @Override
    public void novo() {

    }

    @Override
    public void ler() {

    }
}
