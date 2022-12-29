package br.com.banco.bytebank.model;

public interface Autenticavel {

    void setSenha(String senha);

    boolean autenticou(String senha);

}
