public class Diretor extends Funcionario implements Autenticavel {

    private Autenticacao aut;
    public Diretor(){
        this.aut = new Autenticacao();
    }

    public double getBonificacao() {
        return super.salario;
    }


    @Override
    public void setSenha(String senha) {
        this.aut.senha = senha;
    }

    @Override
    public boolean autenticou(String senha) {
        return this.aut.autentico(senha);
    }
}
