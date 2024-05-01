package org.example;

import java.sql.Time;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class GameTimeWithMinutes {
    public static int initialHour;
    public static int initialMinute;
    public static int finalHour;
    public static int finalMinute;
    public static void readData(){
        Scanner scanner = new Scanner(System.in);
        initialHour = scanner.nextInt();
        initialMinute = scanner.nextInt();
        finalHour = scanner.nextInt();
        finalMinute = scanner.nextInt();
    }
    public static void solution(){
        readData();
        int initialTime = initialHour*60+initialMinute;
        int finalTime = finalHour*60+finalMinute;
        int duration;
        if (finalTime>initialTime){
            duration=finalTime-initialTime;
        } else {
            duration=(1440-initialTime)+finalTime;
        }
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duration/60, duration%60);
    }
}

