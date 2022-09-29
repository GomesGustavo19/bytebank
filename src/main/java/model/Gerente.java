package model;

public class Gerente extends Funcionario {

    private int senha;

    public double getBonificacao() {
        return super.getBonificacao() + super.salario;
    }

    public void setSenha(int senha) {

        if (this.senha > 0)
            this.senha = senha;
    }

    public int getSenha() {
        return this.senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha && senha > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean autentica(String login, int senha) {

        if (login == super.getCpf() && autentica(senha)) {
            System.out.println("Acesso liberado!");
            return true;
        } else {
            System.out.println("Acesso negado, revise os dados!");
            return false;
        }

    }


}
