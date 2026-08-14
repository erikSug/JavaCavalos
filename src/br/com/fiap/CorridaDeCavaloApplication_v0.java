package br.com.fiap;
import java.lang.Thread;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CorridaDeCavaloApplication_v0 {
    public static void main(String[] args) {
        //RECURSOS
        int QUANTIDADE_CAVALOS = 6;

        boolean mudarAposta = false;
        Scanner scanner = new Scanner(System.in);
        //VARIAVEIS
        int[] posicaoCavalo = new int[QUANTIDADE_CAVALOS];
        for (int i  = 0; i < posicaoCavalo.length; i++) {
            posicaoCavalo[i] = 0;
        }
        String[] nomeCavalo = new String[QUANTIDADE_CAVALOS];
        nomeCavalo[0] = "Special Week";
        nomeCavalo[1] = "Grass Wonder";
        nomeCavalo[2] = "El Condor Pasa";
        nomeCavalo[3] = "Seiun Sky";
        nomeCavalo[4] = "King Halo";
        nomeCavalo[5] = "Tsurumaru Tsuyoshi";


        //INPUT DO USUARIO
        System.out.println("Bem vindo ao jogo!");

        System.out.println("Nessa corrida de 2000m, 6 cavalos estão competindo." +
                "\nAposte no cavalo que você confia: ");

        int aposta = coletarAposta(scanner, nomeCavalo);

        scanner.nextLine();
        System.out.println("Pressione Enter para iniciar!");
        scanner.nextLine();

        while (posicaoCavalo[0] < 100 &&
                posicaoCavalo[1] < 100 &&
                posicaoCavalo[2] < 100 &&
                posicaoCavalo[3] < 100 &&
                posicaoCavalo[4] < 100 &&
                posicaoCavalo[5] < 100 )
        {

                for(int i = 0; i < posicaoCavalo.length; i++){
                    posicaoCavalo[i] += Math.random() * 6;
                    System.out.println((i+1) +"- "+ nomeCavalo[i] + ":" + posicaoCavalo[i]);
                    System.out.println(mostrarProgresso(posicaoCavalo[i]));
                    if (i == posicaoCavalo.length - 1 && posicaoCavalo[i] >= 30 && !mudarAposta){
                        System.out.println("Você gostaria de trocar a aposta (s/n)? ");
                        String resposta = scanner.nextLine();
                        if (resposta.equals("s")){
                            aposta = coletarAposta(scanner, nomeCavalo);
                        }
                        mudarAposta = true;
                    }
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                esperar();
        }
        // FINALIZAÇÃO
        System.out.println("Fim de Jogo!");

        int indexVencedor = 0;
        for(int i = 0; i < posicaoCavalo.length - 1; i++){
            if (posicaoCavalo[indexVencedor] < posicaoCavalo[i]){
             indexVencedor = i;
            }
        }
        System.out.println("Vencedor: " + nomeCavalo[indexVencedor]);
        if (aposta == (indexVencedor + 1)){
            System.out.println("Parabéns você ganhou.");
        } else{
            System.out.println("Que pena, não foi dessa vez.");
        }
    }
    public static int coletarAposta(Scanner scanner, String[] nomeCavalo){
        for (int i  = 0; i < nomeCavalo.length; i++) {
            System.out.println((i + 1) + "- " + nomeCavalo[i]);
        }
        int escolha = scanner.nextInt();
        return escolha;
    }
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
    static void esperar(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
