package dadosDaConta;

public class CriarConta {

    public static void main(String[] args) {

        //Criação da conta "Gustavo","111.111.111-11","Programmer",13,1919
        Conta primeiraConta = new Conta();
        primeiraConta.depositar(200.0);
        primeiraConta.setAgencia(1919);
        primeiraConta.setNumero(13);

        //"Mozao","222.222.222-22","Product Owner",13,2525
        Conta segundaConta = new Conta();
        segundaConta.depositar(1500.0);
        segundaConta.setAgencia(2525);
        segundaConta.setNumero(13);

        //Valor do saldo da segunda conta
        System.out.println("Saldo atual da conta é: " + primeiraConta.getSaldo());

        //Teste Metodo depositar
        primeiraConta.depositar(100.0);
        System.out.println("Valor apos o deposito: " + primeiraConta.getSaldo());

        //Teste Metodo saca
        primeiraConta.saca(300.0);
        System.out.println("Valor apos o saque: " + primeiraConta.getSaldo());

        //Valor do saldo da segunda conta
        System.out.println("Valor do saldo da segunda conta: " + segundaConta.getSaldo());

        //Teste de transferencia
        segundaConta.transferir(500.0, primeiraConta);
        System.out.println("Valor da segunda conta apos a transferencia: " + segundaConta.getSaldo());
        System.out.println("Valor da primeira conta apos a transferencia: " + primeiraConta.getSaldo());

    }

}
