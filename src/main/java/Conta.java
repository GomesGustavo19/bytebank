import org.jetbrains.annotations.NotNull;

public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta(int agencia, int numero) {
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;

    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public abstract boolean saca(double valor);

    public boolean transferir(double valor, @NotNull Conta destino) {

        if (this.saldo > 0) {
            saca(valor);
            destino.depositar(valor);
            return true;
        }

        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }


}
