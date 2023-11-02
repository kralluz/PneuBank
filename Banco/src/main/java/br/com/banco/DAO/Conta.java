/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.banco.DAO;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alexandre
 */
public class Conta {

    protected int numero;
    protected Cliente cliente;
    protected double saldo;
    protected String senha;

    public Conta(int numero, Cliente cliente, double saldo, String senha) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
        this.senha = senha;
    }

    public boolean saque(double valor) {

        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean deposito(double valor) {
        saldo += valor;
        return true;
    }

    public String getSenha() {
        return senha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
  
}



