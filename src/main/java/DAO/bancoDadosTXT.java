package DAO;

import model.*;

import java.io.*;
import java.util.ArrayList;

public class bancoDadosTXT {

    File path = new File("bancoDadosTexto.txt");
    Conta conta = new Conta();

    public File getConexao() {

        try {
            if (!path.exists()) {
                path.createNewFile();
            }

        } catch (Exception e) {
            System.out.println("Aberta conexão com o Banco!!");
            e.printStackTrace();
        }


        return path;
    }

    public File leituraArquivo() {

        try {
            InputStreamReader input = new FileReader(path);
            BufferedReader leitor = new BufferedReader(input);

            String linha;

            do {
                linha = leitor.readLine();

                System.out.println(linha);
            } while (linha != null);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao ler o arquivo!!");
        }

        return path;
    }

    public void setGravar(ArrayList<String> cadastro) {

        try {
            FileWriter arq = new FileWriter(path);
            PrintWriter gravar = new PrintWriter(arq);

            int i, n = cadastro.size();
            for (i = 0; i < n; i++) {
                gravar.printf("%s%n", cadastro.get(i));
            }
            gravar.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao gravar no arquivo");
        }
    }

    public void incluir(String nome, String cpf, String profissao, int agencia, int numero, double saldo) {

        ArrayList<String> cadastro = new ArrayList<>();
        cadastro.add(nome + ";" + cpf + ";" + profissao + ";" + agencia + ";" + numero + saldo);
        setGravar(cadastro);

    }


}
