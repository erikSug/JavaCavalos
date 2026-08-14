package br.com.fiap.v1;

import br.com.fiap.v1.util.Serviços;

public class CorridaDeCavalosApplication_v1 {
    public static void main(String[] args) {
        Cavalo cv1 = new Cavalo();
        cv1.correr();
        System.out.println(cv1.correr());
        System.out.println(Serviços.mostrarProgresso(23));
    }
}
