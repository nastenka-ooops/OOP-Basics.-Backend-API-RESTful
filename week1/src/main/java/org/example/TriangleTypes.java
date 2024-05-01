package org.example;

import java.util.*;

public class TriangleTypes {
    public static ArrayList<Float> sides = new ArrayList<>(3);
    public static void readData(){
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        String[] tempSides = temp.split(" ");
        for (String tempSide : tempSides) {
            sides.add(Float.parseFloat(tempSide));
        }
    }
    public static void solution(){
        readData();
        sides.sort(Comparator.reverseOrder());
        if (sides.get(0) >= sides.get(1) + sides.get(2)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (sides.get(0) * sides.get(0) == sides.get(1) * sides.get(1) + sides.get(2) * sides.get(2)) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (sides.get(0) * sides.get(0) > sides.get(1) * sides.get(1) + sides.get(2) * sides.get(2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (sides.get(0) * sides.get(0) < sides.get(1) * sides.get(1) + sides.get(2) * sides.get(2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if ((Objects.equals(sides.get(0), sides.get(1))) && (Objects.equals(sides.get(1), sides.get(2))) && (Objects.equals(sides.get(0), sides.get(2)))) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if ((Objects.equals(sides.get(0), sides.get(1))) || (Objects.equals(sides.get(1), sides.get(2))) || (Objects.equals(sides.get(0), sides.get(2)))) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
