package br.com.pinho.cursos.java.oo.solid.o.heranca;

public class PJ extends Funcionario{

    public PJ(double valorHora, double horasMensaisContratuais, double horasMensaisTrabalhadas, String tipo) {
        super(valorHora, horasMensaisContratuais, horasMensaisTrabalhadas, "PJ");
    }

    public double calculaSalario() {
        double salario = 0;
        salario = this.getHorasMensaisContratuais() * this.getValorHora();
        return salario;
    }
}
