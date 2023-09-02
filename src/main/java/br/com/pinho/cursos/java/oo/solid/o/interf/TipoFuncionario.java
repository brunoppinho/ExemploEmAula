package br.com.pinho.cursos.java.oo.solid.o.interf;

public enum TipoFuncionario {

    CLT(new CLTista()),
    PJ(new PessoaJuridica()),
    TERCEIRIZADO(new Terceirizado());

    public final CalculaRecebimento calculaRecebimento;

    TipoFuncionario(CalculaRecebimento calculaRecebimento) {
        this.calculaRecebimento = calculaRecebimento;
    }
}
