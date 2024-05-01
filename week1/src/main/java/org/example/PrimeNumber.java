package org.example;

import java.util.Scanner;

public class PrimeNumber {
    public static int[] tests;
    public static int amount;
    public static void readData(){
        Scanner scanner = new Scanner(System.in);
        amount = Integer.parseInt(scanner.nextLine());
        tests = new int[amount];
        for (int i = 0; i < amount; i++) {
            tests[i]= Integer.parseInt(scanner.nextLine());
        }
    }

    public static boolean isPrimeNumber(int number){
        for (int i = 2; i *i <=number ; i++) {
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void solution(){
        readData();
        for (int i = 0; i < amount; i++) {
            if (isPrimeNumber(tests[i])){
                System.out.println(tests[i]+ " eh primo");
            } else {
                System.out.println(tests[i]+" nao eh primo");
            }
        }
    }

}
