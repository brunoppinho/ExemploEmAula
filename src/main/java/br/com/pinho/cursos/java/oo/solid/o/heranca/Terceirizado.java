package br.com.pinho.cursos.java.oo.solid.o.heranca;

public class Terceirizado extends Funcionario{


    public Terceirizado(double valorHora, double horasMensaisContratuais, double horasMensaisTrabalhadas, String tipo) {
        super(valorHora, horasMensaisContratuais, horasMensaisTrabalhadas, "TERCEIRIZADO");
    }

    public double calculaSalario() {
        double salario = 0;
        salario = this.getHorasMensaisTrabalhadas() * this.getValorHora();
        return salario;
    }
}
