package br.com.banco.bytebank.model;

public interface Tributavel {

    abstract void setValor(double valor);

    void setPorcetagem(double porcetagem);

    double getValorImposto(double valor, double porcetagem);


}
