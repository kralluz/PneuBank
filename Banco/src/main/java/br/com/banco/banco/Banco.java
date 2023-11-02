package br.com.banco.banco;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import br.com.banco.DAO.FormulariosdeRegistro.FormulariosdeRegistro;

import br.com.banco.DAO.Cliente;
import br.com.banco.DAO.ContaCorrente;
import br.com.banco.DAO.ContaPoupanca;
import br.com.banco.DAO.FormulariosdeRegistro.FormulariosdeRegistro;

public class Banco {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        FormulariosdeRegistro form = new FormulariosdeRegistro();
        ContaPoupanca[] Poupancas = new ContaPoupanca[10];
        
        while (true) {
           // Process process = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
            //process.waitFor();
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
            int selectOption = scanner.nextInt();
            System.out.printf("\n");


            switch (selectOption) {
                case 1:
                    
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
                            "                                                           ║                  3.    Sair                                               ║\n");
                    System.out.printf(
                            "                                                           ╚═══════════════════════════════════════════════════════════════════════════╝\n");
                    System.out.printf(
                            "                                       ╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗\n");
                    System.out.printf("                                                                               Digite a opção escolhida: ");
                    
                    selectOption = scanner.nextInt();
                    System.out.printf("\n");
                    
                    switch (selectOption){
                        
                        case 1:
                            form.cadastroContaCorrente(scanner); 
                            
                            break;
                        case 2:
                            form.cadastroContaPoupanca(scanner);
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    
                break;
                case 2:
                    System.out.println("Você escolheu Entrar na conta.");
                break;
                case 3:
                    System.out.println("Você escolheu Sair.");
                break;
                default:
                    System.out.printf(" Opção inválida !  \n");
                    scanner.close();
                    System.exit(0);
                    break;
            }
        }
    }
}
