package br.com.banco.bytebank.model;

import org.jetbrains.annotations.NotNull;

public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta(int agencia, int numero) {
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;

    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public abstract double saca(double valor) throws SaldoInsulficienteExeception;

    public void transferir(double valor, @NotNull Conta destino) throws SaldoInsulficienteExeception{

        try{
            if (this.saldo > 0) {
                saca(valor);
                destino.depositar(valor);
            }
        }catch (SaldoInsulficienteExeception e){
            e.printStackTrace();
        }


        throw new SaldoInsulficienteExeception("Impossivel realizar a transação");
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }



}
