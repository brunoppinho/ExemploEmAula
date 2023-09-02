package br.com.pinho.cursos.java.oo.solid.o.heranca;

public class Main {

    public static void main(String[] args) {
        Funcionario cltista = new CLTista(10, 200, 300, "CLT");
        Funcionario pessoaJuridica = new PJ(10, 200, 300, "PJ");
        Funcionario terceirizado = new Terceirizado(10, 200, 300, "TERCEIRO");

        System.out.println("O salário de F1 recebido foi de " + cltista.calculaSalario());
        System.out.println("O salário de F2 recebido foi de " + pessoaJuridica.calculaSalario());
        System.out.println("O salário de F3 recebido foi de " + terceirizado.calculaSalario());
    }

}
