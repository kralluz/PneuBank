package br.com.banco.DAO;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(int numero, Cliente cliente, double saldo, String senha, double limite) {
        super(numero, cliente, saldo, senha);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public Cliente getNome(){
        return cliente;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean saque(double valor) {
        if((this.saldo - valor) > (0 - this.limite)){
            this.saldo -= valor;
            return true;
        }   
            return false;
    }
    
    public boolean transferir(double valor, Conta contaDestino){
        if((this.saldo - valor) > (0 - this.limite)){
            this.saque(valor);
            contaDestino.deposito(valor);
            return true;
        }
        return false;
    }

    @Override
    public void exibirConta(){
        System.out.printf(" ╔═══════════════════════════════╗ Conta criada com sucesso! ╔═══════════════════════════════╗\n");
        System.out.println(      " ║    numero da conta: " + getNumero() );
        System.out.println(      " ║    Saldo: " + getSaldo() );
        System.out.println(      " ║    Limite: " + getLimite() );
        System.out.printf(" ╚═══════════════════════════════════════════════════════════════════════════════════════════╝\n");
    }
}

