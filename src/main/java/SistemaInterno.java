public abstract class SistemaInterno {

    public String senha;

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void autenticou(Autenticavel verificacao){
        boolean autentico = verificacao.autenticou(senha);
        if(autentico){
            System.out.println("Acesso Liberado!");
        }else {
            System.out.println("Ops ocorreu um erro");
        }

    }
}
