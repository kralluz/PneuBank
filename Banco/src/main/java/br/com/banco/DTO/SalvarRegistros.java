package br.com.banco.DTO;

import br.com.banco.DAO.Conta;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.LocalDateTime;

public class SalvarRegistros {

    public boolean registraSaque(Conta conta, double valor) {
        try {
            LocalDateTime dataHorario = LocalDateTime.now();
            FileWriter registro = new FileWriter("/tmp/registro.txt", true);
            PrintWriter gravaArquivo = new PrintWriter(registro);

            gravaArquivo.println("=================================================================================");
            gravaArquivo.println("\t\tOperação realizada: SAQUE\n");
            gravaArquivo.println("Data/horário da operação: " + dataHorario);
            gravaArquivo.println("Valor da operação: " + valor);
            gravaArquivo.println("\t\tInformações da conta:");
            gravaArquivo.println("Proprietário: " + conta.getCliente().getNome());
            gravaArquivo.println("Número da conta: " + conta.getNumero());
            gravaArquivo.println("=================================================================================");

            gravaArquivo.close();
            registro.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        return true;
    }

    public boolean registraDeposito(Conta conta, double valor) {
        try {
            LocalDateTime dataHorario = LocalDateTime.now();
            FileWriter registro = new FileWriter("/tmp/registro.txt", true);
            PrintWriter gravaArquivo = new PrintWriter(registro);

            gravaArquivo.println("=================================================================================");
            gravaArquivo.println("\t\tOperação realizada: DEPÓSITO\n");
            gravaArquivo.println("Data/horário da operação: " + dataHorario);
            gravaArquivo.println("Valor da operação: " + valor);
            gravaArquivo.println("\t\tInformações da conta:");
            gravaArquivo.println("Proprietário: " + conta.getCliente().getNome());
            gravaArquivo.println("Número da conta: " + conta.getNumero());
            gravaArquivo.println("=================================================================================");

            gravaArquivo.close();
            registro.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }

    public boolean registraTransferencia(Conta origem, Conta destino, double valor) {
        try {
            LocalDateTime dataHorario = LocalDateTime.now();
            FileWriter registro = new FileWriter("/tmp/registro.txt", true);
            PrintWriter gravaArquivo = new PrintWriter(registro);

            gravaArquivo.println("=================================================================================");
            gravaArquivo.println("\t\tOperação realizada: TRANSFERÊNCIA\n");
            gravaArquivo.println("Data/horário da operação: " + dataHorario);
            gravaArquivo.println("Valor da operação: " + valor + "\n\n");

            gravaArquivo.println("\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            gravaArquivo.println("\t\tInformações da conta origem:");
            gravaArquivo.println("\tProprietário: " + origem.getCliente().getNome());
            gravaArquivo.println("\tNúmero da conta: " + origem.getNumero());
            gravaArquivo.println("\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

            gravaArquivo.println("\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            gravaArquivo.println("\t\tInformações da conta destino:");
            gravaArquivo.println("\tProprietário: " + destino.getCliente().getNome());
            gravaArquivo.println("\tNúmero da conta: " + destino.getNumero());
            gravaArquivo.println("\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

            gravaArquivo.println("=================================================================================");

            gravaArquivo.close();
            registro.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        return true;
    }

    public void registraConsultaSaldo(Conta conta) {
        try {
            LocalDateTime dataHorario = LocalDateTime.now();
            FileWriter registro = new FileWriter("/tmp/registro.txt", true);
            PrintWriter gravaArquivo = new PrintWriter(registro);

            gravaArquivo.println("=================================================================================");
            gravaArquivo.println("\t\tOperação realizada: CONSULTA DE SALDO\n");
            gravaArquivo.println("Data/horário da operação: " + dataHorario);
            gravaArquivo.println("\t\tInformações da conta:");
            gravaArquivo.println("Proprietário: " + conta.getCliente().getNome());
            gravaArquivo.println("Número da conta: " + conta.getNumero());
            gravaArquivo.println("=================================================================================");

            gravaArquivo.close();
            registro.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
