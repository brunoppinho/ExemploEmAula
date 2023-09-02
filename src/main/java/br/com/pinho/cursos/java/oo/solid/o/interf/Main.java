package br.com.pinho.cursos.java.oo.solid.o.interf;

public class Main {

    public static void main(String[] args) {
        Funcionario cltista = new Funcionario(10, 200, 300, TipoFuncionario.CLT);
        Funcionario pessoaJuridica = new Funcionario(10, 200, 300, TipoFuncionario.PJ);
        Funcionario terceirizado = new Funcionario(10, 200, 300, TipoFuncionario.TERCEIRIZADO);

        System.out.println("O salário de F1 recebido foi de " + cltista.calculoSalario());
        System.out.println("O salário de F2 recebido foi de " + pessoaJuridica.calculoSalario());
        System.out.println("O salário de F3 recebido foi de " + terceirizado.calculoSalario());

    }
}
