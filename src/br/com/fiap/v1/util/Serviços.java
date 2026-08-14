package br.com.fiap.v1.util;

public class Serviços {
    public static String mostrarProgresso(int n){
        String barra = "";
        for (int i = 0; i < n; i++){
            barra = barra.concat(".");
        }
        String chegada = "|";
        for (int i = 0; i < 100/2 - n/2; i++){
            chegada = " " + chegada;
        }
        return barra + "\uD800\uDC83" + chegada;
    }
}
