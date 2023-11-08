package br.com.banco.DAO;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, Cliente cliente, double saldo, String senha) {
        super(numero, cliente, saldo, senha);

    }

    public Cliente getNome() {
        return cliente;
    }

    public boolean transferir(double valor, Conta conta) {
        if (this.saldo >= valor) {
            this.saque(valor);
            conta.deposito(valor);
            return true;
        }
        return false;
    }
}
