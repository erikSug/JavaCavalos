package br.com.fiap.v1;

public class Cavalo {
    private int id;
    private int posicao;
    private String nome;

    public int correr(){
        posicao += Math.random() * 6;
        return posicao;
    }
}
