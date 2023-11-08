package br.com.banco.FormulariosdeRegistro;

import java.util.Scanner;

public class MenusUsuario {

    public String MenuPrincipal(Scanner input) {
        String escolha;

        System.out.println("\033[34m");
        System.out.printf(
                "                                                           ╔═══════════════════════════════╗ PneuBank® ╔═══════════════════════════════╗\n");
        System.out.printf(
                "                                                           ║               Menu:                                                       ║\n");
        System.out.printf(
                "                                                           ║                  1.    Cadastrar conta                                    ║\n");
        System.out.printf(
                "                                                           ║                  2.    Entrar na conta                                    ║\n");
        System.out.printf(
                "                                                           ║                  3.    Sair                                               ║\n");
        System.out.printf(
                "                                                           ╚═══════════════════════════════════════════════════════════════════════════╝\n");
        System.out.printf(
                "                                          ╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗\n");
        System.out.printf("                                                                                     Digite a opção escolha: ");

        return escolha = input.next();
    }

//====================================================================================================================================================================================================================
    public String CriacaoConta(Scanner input) {
        String escolha;

        System.out.println("\033[34m");
        System.out.printf(
                "                                                           ╔═════════════════════════════╗ Criar contas ╔══════════════════════════════╗\n");
        System.out.printf(
                "                                                           ║               Menu:                                                       ║\n");
        System.out.printf(
                "                                                           ║                  1.    Criar conta corrente                               ║\n");
        System.out.printf(
                "                                                           ║                  2.    Criar conta Poupança                               ║\n");
        System.out.printf(
                "                                                           ║                  3.    Retornar ao menu                                   ║\n");
        System.out.printf(
                "                                                           ╚═══════════════════════════════════════════════════════════════════════════╝\n");
        System.out.printf(
                "                                       ╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗\n");
        System.out.printf("                                                                               Digite a opção escolhida: ");

        return escolha = input.next();
    }

//====================================================================================================================================================================================================================
    public String menuOperacoesCorrente(Scanner input) {
        System.out.println("\033[34m");
        System.out.printf(
                "                                                           ╔═════════════════════════════╗ Criar contas ╔══════════════════════════════╗\n");
        System.out.printf(
                "                                                           ║               Menu:                                                       ║\n");
        System.out.printf(
                "                                                           ║                  1.    Saldo                                              ║\n");
        System.out.printf(
                "                                                           ║                  2.    Saque                                              ║\n");
        System.out.printf(
                "                                                           ║                  3.    Depósito                                           ║\n");
        System.out.printf(
                "                                                           ║                  4.    Transferência                                      ║\n");
        System.out.printf(
                "                                                           ║                  5.    Voltar                                             ║\n");
        System.out.printf(
                "                                                           ╚═══════════════════════════════════════════════════════════════════════════╝\n");
        System.out.printf(
                "                                       ╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗\n");
        System.out.printf("                                                                               Digite a opção escolhida: ");
        
        return input.next();
    }
    
//====================================================================================================================================================================================================================
    public String menuOperacoesPoupanca(Scanner input) {
        System.out.println("\033[34m");
        System.out.printf(
                "                                                           ╔═════════════════════════════╗ Criar contas ╔══════════════════════════════╗\n");
        System.out.printf(
                "                                                           ║               Menu:                                                       ║\n");
        System.out.printf(
                "                                                           ║                  1.    Saldo                                              ║\n");
        System.out.printf(
                "                                                           ║                  2.    Saque                                              ║\n");
        System.out.printf(
                "                                                           ║                  3.    Depósito                                           ║\n");
        System.out.printf(
                "                                                           ║                  5.    Voltar                                             ║\n");
        System.out.printf(
                "                                                           ╚═══════════════════════════════════════════════════════════════════════════╝\n");
        System.out.printf(
                "                                       ╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗\n");
        System.out.printf("                                                                               Digite a opção escolhida: ");
        
        return input.next();
    }
}
