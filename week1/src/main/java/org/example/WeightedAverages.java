package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class WeightedAverages {
    public static int[] weights = new int[]{2,3,5};
    public static ArrayList<ArrayList<Float>> tests = new ArrayList<>();
    public static int amount;
    public static void readData(){
        Scanner scanner = new Scanner(System.in);
        amount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < amount; i++) {
            ArrayList<Float> temp = new ArrayList<>();
                String s = scanner.nextLine();
                String[] nums = s.split(" ");
                for (String num :
                        nums) {
                    temp.add(Float.parseFloat(num));
                }
            tests.add(temp);
        }
    }
    public static void solution(){
        readData();
        for (ArrayList<Float> numbers : tests) {
            float numberSum = numbers.get(0)*weights[0] + numbers.get(1)*weights[1] + numbers.get(2)*weights[2];
            int totalAmount = weights[0]+weights[1]+weights[2];
            float average = numberSum / totalAmount;
            String result = String.format("%.1f",average);
            System.out.println(result.replace(',','.'));
        }
    }
}
