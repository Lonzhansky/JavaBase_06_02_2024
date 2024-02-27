package ua.hillel.lonzhanskyi.lessons.lesson7;

import java.util.Scanner;

public class HM {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] team1 = new int[5];
        int[] team2 = new int[5];

        double sumTeam1 = 0.0;
        double sumTeam2 = 0.0;

        for (int i = 0; i < team1.length; i++) {
            team1[i] = scanner.nextInt();
            sumTeam1 += team1[i];
        }

        System.out.println();

        for (int i = 0; i < team2.length; i++) {
            team2[i] = scanner.nextInt();
            sumTeam2 += team2[i];
        }

        System.out.println(sumTeam1 / team1.length);
        System.out.println(sumTeam2 / team2.length);

    }
}
