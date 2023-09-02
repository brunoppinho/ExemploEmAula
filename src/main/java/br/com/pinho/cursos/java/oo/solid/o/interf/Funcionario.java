package br.com.pinho.cursos.java.oo.solid.o.interf;

public class Funcionario {

    private double valorHora;
    private double horasMensaisContratuais;
    private double horasMensaisTrabalhadas;
    private TipoFuncionario tipo;

    public Funcionario(double valorHora, double horasMensaisContratuais, double horasMensaisTrabalhadas, TipoFuncionario tipo) {
        this.valorHora = valorHora;
        this.horasMensaisContratuais = horasMensaisContratuais;
        this.horasMensaisTrabalhadas = horasMensaisTrabalhadas;
        this.tipo = tipo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasMensaisContratuais() {
        return horasMensaisContratuais;
    }

    public void setHorasMensaisContratuais(double horasMensaisContratuais) {
        this.horasMensaisContratuais = horasMensaisContratuais;
    }

    public double getHorasMensaisTrabalhadas() {
        return horasMensaisTrabalhadas;
    }

    public void setHorasMensaisTrabalhadas(double horasMensaisTrabalhadas) {
        this.horasMensaisTrabalhadas = horasMensaisTrabalhadas;
    }

    public TipoFuncionario getTipo() {
        return tipo;
    }

    public void setTipo(TipoFuncionario tipo) {
        this.tipo = tipo;
    }

    public double calculoSalario() {
        return getTipo().calculaRecebimento.calculaSalario(getHorasMensaisContratuais(), getValorHora(),
                getHorasMensaisTrabalhadas());
    }
}
