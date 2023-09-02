package br.com.pinho.cursos.java.oo.solid.o.heranca;

public class CLTista extends Funcionario {

    public CLTista(double valorHora, double horasMensaisContratuais, double horasMensaisTrabalhadas, String tipo) {
        super(valorHora, horasMensaisContratuais, horasMensaisTrabalhadas, "CLT");
    }

    public double calculaSalario() {
        double salario = 0;
        salario = this.getHorasMensaisContratuais() * this.getValorHora();
        salario += (this.getHorasMensaisTrabalhadas() - this.getHorasMensaisContratuais()) * 1.5 * this.getValorHora();
        return salario;
    }
}
