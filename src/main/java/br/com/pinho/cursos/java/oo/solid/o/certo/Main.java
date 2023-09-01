package br.com.pinho.cursos.java.oo.solid.o.certo;

public class Main {

    public static void main(String[] args) {
        Funcionario cltista = new Funcionario(10, 200, 300, "CLT");
        Funcionario pessoaJuridica = new Funcionario(10, 200, 300, "PJ");
        Funcionario terceirizado = new Funcionario(10, 200, 300, "TERCEIRO");

        CalculaRecebimento calculaRecebimento = new CalculaRecebimento();
        System.out.println("O salário de F1 recebido foi de " + calculaRecebimento.calculaSalario(cltista));
        System.out.println("O salário de F2 recebido foi de " + calculaRecebimento.calculaSalario(pessoaJuridica));
        System.out.println("O salário de F3 recebido foi de " + calculaRecebimento.calculaSalario(terceirizado));
    }
}
