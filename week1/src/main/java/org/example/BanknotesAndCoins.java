package org.example;

import java.util.Scanner;

public class BanknotesAndCoins {
    public static final int[] banknotes = new int[]{100,50,20,10,5,2};
    public static final float[] coins = new float[]{1,0.5f,0.25f,0.10f,0.05f,0.01f};
    float value;
    public void readData(){
        Scanner scanner = new Scanner(System.in);
        value = Float.parseFloat(scanner.nextLine());
    }
    public void solution(){
        readData();
        float temp = value;
        System.out.println("NOTAS:");
        for (float banknote :
                banknotes) {
            int count=0;
            while (temp-banknote>=0){
                count++;
                temp-=banknote;
            }
            String str = String.format(count + " nota(s) de R$ %.2f%n", banknote);
            System.out.print(str);
        }
        System.out.println("MOEDAS:");
        temp=Math.round(temp*100);
        for (float coin :
                coins) {
            float tempCoin = coin*100;
            int count=0;
            while (temp-tempCoin>=0){
                count++;
                temp-=tempCoin;
            }
            String str = String.format(count + " moeda(s) de R$ %.2f%n", coin);
            System.out.print(str);
        }
    }
}
