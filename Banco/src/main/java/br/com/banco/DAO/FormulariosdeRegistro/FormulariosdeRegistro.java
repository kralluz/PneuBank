package br.com.banco.DAO.FormulariosdeRegistro;

import br.com.banco.DAO.Cliente;
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

        Cliente cliente = new Cliente(name, cpf);

        return cliente;
    }

    public ContaCorrente cadastroContaCorrente(Scanner input) {

        Cliente c = cadastroCliente(input);

        System.out.println("Digite o número da conta: ");
        int numero = input.nextInt();
        System.out.println("Digite o saldo da conta: ");
        double saldo = input.nextDouble();
        System.out.println("Digite a senha da conta: ");
        input.nextLine();
        String senha = input.nextLine();
        System.out.println("Digite o limite da conta: ");
        double limite = input.nextDouble();

        ContaCorrente NovaContaCorrente = new ContaCorrente(numero, c, saldo, senha, limite);
        NovaContaCorrente.exibirConta();

        return NovaContaCorrente;
    }

    public ContaPoupanca cadastroContaPoupanca(Scanner input) {

        Cliente c = cadastroCliente(input);

        System.out.println("Digite o número da conta: ");
        int numero = input.nextInt();
        System.out.println("Digite o saldo da conta: ");
        double saldo = input.nextDouble();
        System.out.println("Digite a senha da conta: ");
        String senha = input.nextLine();
        
        ContaPoupanca conta = new ContaPoupanca(numero, c, saldo, senha);
        
        conta.exibirConta();
        
        return conta;
    }
}
