package org.example;

import java.util.Scanner;

public class ColumnInArray {
    public static final int size = 12;
    public static float[][] matrix=new float[size][size];
    public static int column;
    public static String operation = new String();

    public static void readData (){
        Scanner scanner = new Scanner(System.in);
        column = Integer.parseInt(scanner.nextLine());
        operation = scanner.nextLine();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j]= Float.parseFloat(scanner.nextLine());
            }
        }
    }
    public static void solution(){
        readData();
        float sum = 0;
        for (int i = 0; i < size; i++) {
            sum+=matrix[i][column];
        }
        if (operation.equalsIgnoreCase("s")){
            String s = String.format("%.1f",sum);
            System.out.println(s.replace(',','.'));
        } else if (operation.equalsIgnoreCase("m")){
            String s = String.format("%.1f",sum/size);
            System.out.println(s.replace(',','.'));
        }

    }
}
