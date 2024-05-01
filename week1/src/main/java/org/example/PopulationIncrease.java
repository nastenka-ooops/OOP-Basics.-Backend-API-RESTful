package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class PopulationIncrease {
    public static int amount;
    public static ArrayList<String> tests = new ArrayList<>();
    public static void readData(){
        Scanner scanner = new Scanner(System.in);
        amount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < amount; i++) {
            tests.add(scanner.nextLine());
        }
    }
    public static void solution(){
        readData();
        for (String test:
             tests) {
            String[] s = test.split(" ");
            int populationA = Integer.parseInt(s[0]);
            int populationB = Integer.parseInt(s[1]);
            float growingRateA = Float.parseFloat(s[2]);
            float growingRateB = Float.parseFloat(s[3]);
            int years = count(populationA, populationB, growingRateA, growingRateB);
            if (years > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(years + " anos.");
            }
        }
    }

    public static int count(int populationA, int populationB, float growingRateA, float growingRateB) {
        int years = 0;
        while (populationA <= populationB) {
            populationA = populationA + (int) (populationA * growingRateA / 100);
            populationB = populationB + (int) (populationB * growingRateB / 100);
            years++;
            if (years > 100) {
                break;
            }
        }
        return years;
    }
}
