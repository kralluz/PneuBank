package br.com.banco.FormulariosdeRegistro;

import br.com.banco.DAO.Cliente;
import br.com.banco.DAO.Conta;
import br.com.banco.DAO.ContaCorrente;
import br.com.banco.DAO.ContaPoupanca;
import java.util.Scanner;

public class FormulariosdeRegistro {

    public Cliente cadastroCliente(Scanner input) {
        String name;
        String cpf;

        System.out.println("cadastro de cliente");
        input.nextLine();
        System.out.println("Digite seu nome: ");
        name = input.nextLine();
        System.out.println("Digite seu CPF: ");
        cpf = input.nextLine();

        return new Cliente(name, cpf);
    }

    public ContaCorrente cadastroContaCorrente(Scanner input) {
        Cliente c = cadastroCliente(input);

        System.out.println("Digite o número da conta: ");
        int numero = input.nextInt();        
        System.out.println("Digite a senha da conta: ");
        input.nextLine();
        String senha = input.nextLine();
        System.out.println("Digite o seu salário atual: ");
        double salario = input.nextDouble();
        
        double saldo = 0;
        double limite = salario * 0.25;

        return new ContaCorrente(numero, c, saldo, senha, limite);
    }

    public ContaPoupanca cadastroContaPoupanca(Scanner input) {
        Cliente c = cadastroCliente(input);

        System.out.println("Digite o número da conta: ");
        int numero = input.nextInt();
        input.nextLine();
        System.out.println("Digite a senha da conta: ");
        String senha = input.nextLine();
        
        double saldo = 0;
        
        return new ContaPoupanca(numero, c, saldo, senha);
    }
    
    public int buscarConta(Conta[] conta, int numero, String senha){
        try {
            for(int i = 0; i < conta.length; i++){
                if((conta[i].getNumero() == numero) && (conta[i].getSenha().equals(senha))){
                    return i;
                }
            }
        } catch(Exception e){
            System.out.println("Conta não encontrada!");
        }
        return -1;
    }
    
    public int buscarConta(Conta[] conta, int numero) {
        for (int i = 0; i < conta.length; i++) {
            if ((conta[i].getNumero() == numero)) {
                return i;
            }
        }
        return -1;
    }
    public void limparTela(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }


}
