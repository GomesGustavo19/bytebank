package br.com.banco.bytebank.model;

public class Gerente extends Funcionario implements Autenticavel {

    private Autenticacao aut;

    private Gerente(){
        this.aut = new Autenticacao();
    }

    public double getBonificacao() {
        return super.salario;
    }

    @Override
    public boolean autenticou(String senha) {

        return this.aut.autentico(senha);

    }

    @Override
    public void setSenha(String senha) {
        this.aut.senha = senha;
    }
}
