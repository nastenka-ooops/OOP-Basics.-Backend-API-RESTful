package org.example;

import java.util.Scanner;

public class Grenais {
    public static int victoriesOfInter = 0;
    public static int victoriesOfGremio = 0;
    public static int draws = 0;
    public static int grenais = 0;

    public static void solution(){
        Scanner scanner = new Scanner(System.in);
        int state = 1;
        while (state==1) {
            grenais++;
            int interScore = scanner.nextInt();
            int gremioScore = scanner.nextInt();
            if (interScore > gremioScore) {
                victoriesOfInter++;
            } else if (gremioScore > interScore) {
                victoriesOfGremio++;
            } else draws++;
            System.out.println("Novo grenal (1-sim 2-nao)");
            state=scanner.nextInt();
        }
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" +victoriesOfInter);
        System.out.println("Gremio:" +victoriesOfGremio);
        System.out.println("Empates:" +draws);
        if (victoriesOfGremio>victoriesOfInter){
            System.out.println("Gremio venceu mais");
        } else if (victoriesOfInter>victoriesOfGremio){
            System.out.println("Inter venceu mais");
        } else {
            System.out.println("Não houve vencedor");
        }
    }
}
