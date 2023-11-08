package br.com.banco.banco;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import br.com.banco.FormulariosdeRegistro.FormulariosdeRegistro;

import br.com.banco.DAO.Cliente;
import br.com.banco.DAO.Conta;
import br.com.banco.DAO.ContaCorrente;
import br.com.banco.DAO.ContaPoupanca;
import br.com.banco.DTO.SalvarRegistros;
import br.com.banco.FormulariosdeRegistro.FormulariosdeRegistro;
import br.com.banco.FormulariosdeRegistro.MenusUsuario;

public class Banco {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        FormulariosdeRegistro form = new FormulariosdeRegistro();
        MenusUsuario menu = new MenusUsuario();
        SalvarRegistros gravar = new SalvarRegistros();
        Conta[] contas = new Conta[10];
        
        
        int i = 0;
        int numero;
        String selectOption;
        double valorOperacao;
        boolean close = false;
        boolean loop = false;
        
        
        do {
            //exibição menu principal
            selectOption = menu.MenuPrincipal(scanner);
            System.out.printf("\n");

            switch (selectOption) {
                case "1":
                   form.limparTela();
                    
                    selectOption = menu.CriacaoConta(scanner);

                    System.out.printf("\n");

                    switch (selectOption) {
                        case "1":
                            
                            form.limparTela();
                            contas[i] = form.cadastroContaCorrente(scanner);
                            contas[i].exibirConta();
                            form.limparTela();
                            i++;
                            break;

                        case "2":
                            
                            form.limparTela();
                            contas[i] = form.cadastroContaPoupanca(scanner);
                            contas[i].exibirConta();
                            i++;
                            break;
                        case "3":
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                case "2":
                    
                    form.limparTela();

                    System.out.println("Você escolheu Entrar na conta.");
                    System.out.println("\033[34m");
                    System.out.printf(
                            "                                                           ╔═════════════════════════════╗ Entrar na Conta ╔══════════════════════════════╗\n");
                    System.out.printf(
                            "                                                           ║               Digite o numero da conta: ");
                    numero = scanner.nextInt();
                    scanner.nextLine(); //Descarta linha
                    System.out.printf(
                            "                                                           ║               Digite a senha da conta: ");
                    String senha = scanner.nextLine();

                    int indiceAlvo = form.buscarConta(contas, numero, senha);
                    if(indiceAlvo == -1) break;
                    
                    do{
                        if(contas[indiceAlvo] instanceof ContaCorrente){
                            selectOption = menu.menuOperacoesCorrente(scanner);
                        } else{
                            selectOption = menu.menuOperacoesPoupanca(scanner);
                        }

                        switch (selectOption) {
                            case "1": //Saldo
                                
                                form.limparTela();
                                System.out.println("Saldo: " + contas[indiceAlvo].getSaldo());
                                gravar.registraConsultaSaldo(contas[indiceAlvo]);
                                break;
                            case "2": //Saque
                                
                                form.limparTela();
                                System.out.println("Insira o valor do saque: ");
                                valorOperacao = scanner.nextDouble();

                                if (contas[indiceAlvo].saque(valorOperacao)) {
                                    
                                    form.limparTela();
                                    System.out.println("Saque realizado com sucesso!");
                                    System.out.println("Novo saldo: " + contas[indiceAlvo].getSaldo());
                                    gravar.registraSaque(contas[indiceAlvo], valorOperacao);
                                    break;
                                } else {
                                    
                                    form.limparTela();
                                    System.out.println("Ocorreu um erro. Verifique o saldo e tente novamente.");
                                }
                                break;

                            case "3": //Depósito
                                
                                form.limparTela();
                                System.out.println("Insira o valor do depósito: ");
                                valorOperacao = scanner.nextDouble();

                                if (contas[indiceAlvo].deposito(valorOperacao)) {
                                    
                                    form.limparTela();
                                    System.out.println("Depósito realizado com sucesso!");
                                    System.out.println("Novo saldo: " + contas[indiceAlvo].getSaldo());
                                    gravar.registraDeposito(contas[indiceAlvo], valorOperacao);
                                } else {
                                    
                                    form.limparTela();
                                    System.out.println("Ocorreu um erro.");
                                }
                                break;
                            case "4": //Transferência
                                
                                form.limparTela();
                                System.out.printf(
                                        "                                                           ╔═════════════════════════════╗ Transferir para Conta ╔══════════════════════════════╗\n");
                                System.out.printf(
                                        "                                                           ║               Digite o numero da conta destino: ");
                                numero = scanner.nextInt();
                                scanner.nextLine();
                                int indiceDestino = form.buscarConta(contas, numero);



                                if (indiceDestino != -1) {

                                    form.limparTela();
                                    System.out.println("Insira o valor da transferência: ");
                                    valorOperacao = scanner.nextDouble();

                                    ContaCorrente c = (ContaCorrente) contas[indiceAlvo];
                                    c.transferir(valorOperacao, contas[indiceDestino]);
                                    gravar.registraTransferencia(c, contas[indiceDestino], valorOperacao);
                                    
                                    System.out.println("Transferência feita com suscesso!");
                                        
                                } else{
                                    
                                    form.limparTela();
                                    System.out.println("Conta não encontrada. Verifique o número e tente novamente.");
                                    
                                    break;
                                }
                                
                                break;
                            case "5": //Voltar
                                loop = true;
                                break;
                        }
                    }while(loop == false);
                    break;

                case "3":
                    
                    form.limparTela();
                    System.out.println("Você escolheu Sair.");
                    close = true;
                    break;
                default:
                    System.out.printf(" Opção inválida !  \n");
                    scanner.close();
                    System.exit(0);
            }
        } while (close == false);
    }
}
