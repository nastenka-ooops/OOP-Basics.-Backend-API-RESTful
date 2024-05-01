package org.example;

import java.util.Scanner;

public class Banknotes {
    public static final float[] banknotes = new float[]{100,50,20,10,5,2,1};
    float value;
    public void readData(){
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextInt();
    }
    public void solution(){
        readData();
        System.out.println(value);
        float temp = value;
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
    }
}
