package bancoDeDados;

public class testaBanco {

    public static void main(String[] args) {
        bancoDadosTXT bd = new bancoDadosTXT();

        bd.getConexao();
        bd.leituraArquivo();
    }
}
