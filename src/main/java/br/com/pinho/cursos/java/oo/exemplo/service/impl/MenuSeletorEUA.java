package br.com.pinho.cursos.java.oo.exemplo.service.impl;

import br.com.pinho.cursos.java.oo.exemplo.service.api.MenuSeletor;

import java.util.Scanner;

public class MenuSeletorEUA implements MenuSeletor {

    @Override
    public int execute() {
        System.out.println("Insert a option");
        System.out.println("1 - Balance");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdraw");
        System.out.println("4 - Transfer");
        System.out.println("0 - Exist");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    @Override
    public boolean tryAgain() {
        System.out.println("Invalid option. Please, try again.");
        return true;
    }

}
