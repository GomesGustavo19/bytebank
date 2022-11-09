import org.jetbrains.annotations.NotNull;

public class CalculadorImposto {

    public double valor;
    public double porcetagem;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setPorcetagem(double porcetagem) {
        this.porcetagem = porcetagem;
    }

    public double getValorImposto(double valor, double porcetagem) {
        return (porcetagem * valor) / 100;
    }

    public void registra(Tributavel t){

    }


}
