public class Autenticacao {

    public String senha;

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean autentico(String senha){
        if(this.senha.equals(senha)){
            System.out.println("Acesso Liberado!");
            return true;
        }else {
            System.out.println("Ops ocorreu um erro");
            return false;
        }

    }

}
