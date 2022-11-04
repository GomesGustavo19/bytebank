public class Diretor extends Gerente {

    public double getBonificacao() {
        return super.getBonificacao() + super.getBonificacao();
    }
}
