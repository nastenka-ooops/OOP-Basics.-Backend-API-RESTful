package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumber {
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

    public static ArrayList<Integer> findDivisors(int number){
        ArrayList<Integer> divisors= new ArrayList<>();
        for (int i = 1; i<= number/2; i++) {
            if (number %i==0){
                divisors.add(i);
            }
        }

        return divisors;
    }

    public static void solution(){
        readData();
        for (int i = 0; i < amount; i++) {
            ArrayList<Integer> divisors = findDivisors(tests[i]);
            int sum=0;
            for (Integer divisor: divisors) {
                sum+=divisor;
            }
            if (sum==tests[i]){
                System.out.println(tests[i]+" eh perfeito");
            } else {
                System.out.println(tests[i]+" nao eh perfeito");
            }
        }
    }
}
