public class SeguroVida implements Tributavel {

    private CalculadorImposto calculadorImposto;

    public SeguroVida() {
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
