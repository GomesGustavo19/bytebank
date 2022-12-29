package br.com.banco.bytebank.model;

public class Cliente implements Autenticavel {

    private String nome;
    private String cpf;
    private String profissao;
    private Autenticacao aut;

    public Cliente() {
        this.aut = new Autenticacao();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
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

