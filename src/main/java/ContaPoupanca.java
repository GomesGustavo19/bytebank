public class ContaPoupanca extends Conta{
    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {

        if (super.saldo >= 0 && super.saldo > valor) {
            double valorASacar = valor + 0.1;
            super.saldo -= valorASacar;
            System.out.println("Valor sacado com sucesso!" + valorASacar);
            return true;
        }

        return false;
    }


}
