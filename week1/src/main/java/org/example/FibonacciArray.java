package org.example;

import java.util.Scanner;

public class FibonacciArray {
    public static long[] fibonacciArray = new long[61];
    public static int[] tests;
    public static int amount;
    public static void initializeFibonacciArray(){
        fibonacciArray[0]=0;
        fibonacciArray[1]=1;
        for (int i = 2; i < fibonacciArray.length; i++) {
            fibonacciArray[i]=fibonacciArray[i-2]+fibonacciArray[i-1];
        }
    }
    public static void readData(){
        Scanner scanner = new Scanner(System.in);
        amount = Integer.parseInt(scanner.nextLine());
        tests = new int[amount];
        for (int i = 0; i < amount; i++) {
            tests[i]= Integer.parseInt(scanner.nextLine());
        }
    }
    public static void solution(){
        initializeFibonacciArray();
        readData();
        for (int i = 0; i < amount; i++) {
            System.out.println("Fib("+ tests[i]+") = "+fibonacciArray[tests[i]]);
        }
    }
}
