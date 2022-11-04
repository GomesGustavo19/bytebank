import javax.xml.xpath.XPath;
import java.text.DecimalFormat;

public class CriarContaTeste {

    public static void main(String[] args) {

        //Criação da conta "Gustavo","111.111.111-11","Programmer",13,1919
        ContaCorrente primeiraConta = new ContaCorrente(13, 1919);
        primeiraConta.depositar(200.0);
        primeiraConta.setAgencia(1919);
        primeiraConta.setNumero(13);

        //"Mozao","222.222.222-22","Product Owner",13,2525
        ContaPoupanca segundaConta = new ContaPoupanca(13, 2525);
        segundaConta.depositar(1500.0);
        segundaConta.setAgencia(2525);
        segundaConta.setNumero(13);

        //Valor do saldo da segunda conta
        System.out.println("Saldo atual da conta é: " + primeiraConta.getSaldo());

        //Teste Metodo depositar
        primeiraConta.depositar(100.0);
        System.out.println("Valor apos o deposito: " + primeiraConta.getSaldo());

        //Teste Metodo saca
        segundaConta.saca(299.0);
        System.out.println("Valor apos o saque: " + segundaConta.getSaldo());

        //Valor do saldo da segunda conta
        System.out.println("Valor do saldo da segunda conta: " + segundaConta.getSaldo());

        //Teste de transferencia
        primeiraConta.transferir(500.0, segundaConta);
        System.out.println("Valor da segunda conta apos a transferencia: " + segundaConta.getSaldo());
        System.out.println("Valor da primeira conta apos a transferencia: " + primeiraConta.getSaldo());

    }

    //public static void main(String[] args) {

    // Funcionario g = new Gerente();
    //  Funcionario f = new Funcionario();
    //  Funcionario d = new Diretor();

    //  g.setNome("Gustavo");
    //  g.setCpf("212312312121");
    //  g.setSalario(5500.0);
    //  f.setSalario(2500.0);
    //  d.setSalario(10000.0);

    //  ControleBonificacao cb = new ControleBonificacao();
    //  cb.registra(g);
    //  cb.registra(f);
    //  cb.registra(d);

    //    System.out.println("valor somado: " + cb.getSoma());


    //  System.out.println(g.getNome());
    //  System.out.println(g.getCpf());
    //  System.out.println(g.getSalario());
    //  System.out.println(g.getBonificacao());
    //  System.out.println(":D");

    //}

}
