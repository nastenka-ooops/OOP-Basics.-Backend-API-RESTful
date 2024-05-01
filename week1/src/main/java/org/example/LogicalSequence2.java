package org.example;

import java.util.Scanner;

public class LogicalSequence2 {
    public static int x;
    public static int y;
    public static void readData(){
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
    }
    public static void solution(){
        readData();
        int count = 0;

        for (int i = 1; i <= y; i++) {
            count++;
            System.out.print(i);

            if (count < x) {
                System.out.print(" ");
            }

            if (count == x) {
                System.out.println();
                count = 0;
            }
        }

        if (count != 0) {
            System.out.println();
        }

    }
}
