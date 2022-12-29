package br.com.banco.bytebank.model;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public double saca(double valor) throws SaldoInsulficienteExeception{

        if (super.saldo >= 0 && super.saldo > valor) {
            double valorASacar = valor + 0.1;
            super.saldo -= valorASacar;
            System.out.println("Valor sacado com sucesso!" + valorASacar);
        }

        throw new SaldoInsulficienteExeception("Impossivel realizar a operação");
    }


}
