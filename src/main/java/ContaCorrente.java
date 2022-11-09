public class ContaCorrente extends Conta implements Tributavel {

    private CalculadorImposto calculadorImposto;

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
        this.calculadorImposto = new CalculadorImposto();

    }

    @Override
    public boolean saca(double valor) {

        if (super.saldo >= 0 && super.saldo > valor) {
            double tributo = this.getValorImposto(1, 20);
            double valorASacar = valor + tributo;
            super.saldo -= valorASacar;
            System.out.println("Valor sacado com sucesso!" + valorASacar);
            return true;
        }

        return false;
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
