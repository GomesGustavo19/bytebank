package dadosDaConta;

public class testaMetodo {

    public static void main(String[] args) {
        Conta conta = new Conta();

        //conta.setDadosPessoal("Gustavo","111.111.111-11","Programmer");

        System.out.println(conta.getTitular().getNome() );
    }

}
