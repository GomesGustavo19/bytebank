package br.com.banco.bytebank.model;

public class SaldoInsulficienteExeception extends Exception{

    public SaldoInsulficienteExeception (String msg){

        super(msg);
    }
}
