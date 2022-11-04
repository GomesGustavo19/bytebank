public class ContaPoupanca extends Conta{
    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {

        if (super.saldo >= 0 && super.saldo > valor) {
            double valorASacar = valor + 0.1;
            super.saldo -= valor;
            System.out.println("Valor sacado com sucesso!");
            return saca(valorASacar);


        } else {
            System.out.println("Não foi possivel realizar o saque!");
        }

        return false;
    }
}
