package org.example;

public class SequenceIJ4 {
    public static void solution(){
        for (float i = 0; i <=2.2; i+= 0.2F) {
            for (int j = 1; j <=3; j++) {
                System.out.printf("I=%.1f J=%.1f\n",i,j+i);
            }
        }
    }
}
