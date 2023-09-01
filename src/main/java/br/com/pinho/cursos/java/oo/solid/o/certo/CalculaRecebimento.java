package br.com.pinho.cursos.java.oo.solid.o.certo;

public class CalculaRecebimento {

    public double calculaSalario(Funcionario funcionario) {
        double salario = 0;

        if ("CLT".equalsIgnoreCase(funcionario.getTipo())) {
            salario = funcionario.getHorasMensaisContratuais() * funcionario.getValorHora();
            salario += (funcionario.getHorasMensaisTrabalhadas() - funcionario.getHorasMensaisContratuais()) * 1.5 * funcionario.getValorHora();
        } else if ("PJ".equalsIgnoreCase(funcionario.getTipo())) {
            salario = funcionario.getHorasMensaisContratuais() * funcionario.getValorHora();
        } else if ("TERCEIRIZADO".equalsIgnoreCase(funcionario.getTipo())) {
            salario = funcionario.getHorasMensaisTrabalhadas() * funcionario.getValorHora();
        } else {
            System.err.println("Tipo inválido!");
        }

        return salario;
    }
}
