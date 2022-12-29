package br.com.banco.bytebank.teste;

import br.com.banco.bytebank.model.SeguroVida;

public class testeCalculoImposto {

    public static void main(String[] args)  {


        SeguroVida seguroVida = new SeguroVida();

        double calculo = seguroVida.getValorImposto(1,20);



        System.out.println(calculo);
    }
}
