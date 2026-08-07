package br.com.fiap;
import java.lang.Thread;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CorridaDeCavaloApplication_v0 {
    public static void main(String[] args) {
        //RECURSOS

        //VARIAVEIS
        int posicaoCavalo1 = 0;
        int posicaoCavalo2 = 0;
        int posicaoCavalo3 = 0;
        int posicaoCavalo4 = 0;
        int posicaoCavalo5 = 0;
        int posicaoCavalo6 = 0;
        //INPUT DO USUARIO
        System.out.println("Bem vindo ao jogo!");

        System.out.println("Nessa corrida de 2000m, 6 cavalos estão competindo." +
                "\nAposte no cavalo que você confia: ");
        System.out.println("1 - Special Week");
        System.out.println("2 - Grass Wonder");
        System.out.println("3 - El Condor Pasa");
        System.out.println("4 - Seiun Sky");
        System.out.println("5 - King Halo");
        System.out.println("6 - Tsurumaru Tsuyoshi");
        Scanner scanner = new Scanner(System.in);
        int aposta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Pressione Enter para iniciar!");
        scanner.nextLine();
        while (posicaoCavalo1 < 100 &&
                posicaoCavalo2 < 100 &&
                posicaoCavalo3 < 100 &&
                posicaoCavalo4 < 100 &&
                posicaoCavalo5 < 100 &&
                posicaoCavalo6 < 100 ){
            posicaoCavalo1 += Math.random() * 6;
            System.out.println("1 - Special Week: " + posicaoCavalo1);
            posicaoCavalo2 += Math.random() * 6;
            System.out.println("2 - Grass Wonder: " + posicaoCavalo2);
            posicaoCavalo3 += Math.random() * 6;
            System.out.println("3 - El Condor Pasa: " + posicaoCavalo3);
            posicaoCavalo4 += Math.random() * 6;
            System.out.println("4 - Seiun Sky: " + posicaoCavalo4);
            posicaoCavalo5 += Math.random() * 6;
            System.out.println("5 - King Halo: " + posicaoCavalo5);
            posicaoCavalo6 += Math.random() * 6;
            System.out.println("6 - Tsurumaru Tsuyoshi: " + posicaoCavalo6);
            System.out.println("------------------------------------");
            esperar();
        }
        // FINALIZAÇÃO
        System.out.println("Fim de Jogo!");
    }

    static void esperar(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
