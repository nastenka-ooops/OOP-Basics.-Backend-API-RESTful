package org.example;

import java.util.*;

public class CaesarCipher {
    public static int amount;
    public static final String alphabet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static ArrayList<String> tests = new ArrayList<>();
    public static ArrayList<Integer> shifts = new ArrayList<>();

    public static void readData(){
        Scanner scanner = new Scanner(System.in);
        amount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < amount; i++) {
            String test = scanner.nextLine();
            tests.add(test);
            int shift = Integer.parseInt(scanner.nextLine());
            shifts.add(shift);
        }
    }

    public static void solution(){
        readData();
        for (int i = 0; i < amount; i++) {
            StringBuilder result = new StringBuilder();
            String test = tests.get(i);
            int shift = shifts.get(i);
            for (int j = 0; j < test.length(); j++) {
                int oldIndex = alphabet.indexOf(test.charAt(j));
                int newIndex = (oldIndex - shift+alphabet.length()) % alphabet.length();
                result.append(alphabet.charAt(newIndex));
            }
            System.out.println(result);
        }
    }
}
