package br.com.banco.bytebank.teste;

import br.com.banco.bytebank.model.ContaCorrente;
import br.com.banco.bytebank.model.ContaPoupanca;
import br.com.banco.bytebank.model.CalculadorImposto;
import br.com.banco.bytebank.model.SaldoInsulficienteExeception;
import br.com.banco.bytebank.model.SeguroVida;

public class CriarContaTeste {

    public static void main(String[] args) {

        //Criação da conta "Gustavo","111.111.111-11","Programmer",13,1919
        ContaCorrente primeiraConta = new ContaCorrente(13, 1919);
        primeiraConta.depositar(400.0);
        primeiraConta.setAgencia(1919);
        primeiraConta.setNumero(13);

        //"Mozao","222.222.222-22","Product Owner",13,2525
        ContaPoupanca segundaConta = new ContaPoupanca(13, 2525);
        segundaConta.depositar(1500.0);
        segundaConta.setAgencia(2525);
        segundaConta.setNumero(13);

        CalculadorImposto ci = new CalculadorImposto();
        SeguroVida sv = new SeguroVida();
        //Teste Metodo saca
        try {
            primeiraConta.saca(270.0);
            System.out.println("Valor apos o saque: " + primeiraConta.getSaldo());
            sv.getValorImposto(100,20);
            ci.registra(primeiraConta);
            ci.registra(sv);
        }catch(SaldoInsulficienteExeception e){
            System.out.println("Não foi possivel realizar a operação");
        }





    }

}
