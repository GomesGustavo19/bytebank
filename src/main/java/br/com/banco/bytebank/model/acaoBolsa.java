package br.com.banco.bytebank.model;

public class acaoBolsa implements Tributavel {

    private CalculadorImposto calculadorImposto;


    public acaoBolsa() {
        this.calculadorImposto = new CalculadorImposto();
    }

    @Override
    public void setValor(double valor) {
        this.calculadorImposto.valor = valor;
    }

    @Override
    public void setPorcetagem(double porcetagem) {
        this.calculadorImposto.porcetagem = porcetagem;
    }

    @Override
    public double getValorImposto(double valor, double porcetagem) {

        return this.calculadorImposto.getValorImposto(valor, porcetagem);
    }

}
