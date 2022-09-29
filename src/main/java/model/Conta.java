package model;

import org.jetbrains.annotations.NotNull;

public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {

        if (this.saldo > 0)
            this.saldo -= valor;

        return false;
    }

    public boolean transferir(double valor, @NotNull Conta destino) {

        if (this.saldo > 0) {
            saca(valor);
            destino.depositar(valor);
            return true;
        }

        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setDadosPessoal(String nome, String cpf, String profissao, int numero, int agencia, double saldo) {

    }


}
