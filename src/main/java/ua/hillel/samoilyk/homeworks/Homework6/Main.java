package ua.hillel.samoilyk.homeworks.Homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First Team
        System.out.println("Write first Team: ");
        String firstTeam = scanner.nextLine();

        int player1Team1, player2Team1, player3Team1, player4Team1, player5Team1;

        System.out.println("How much kills player 1 have in team: " + '"' + firstTeam + '"');
        if (scanner.hasNextInt()) {
            player1Team1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("How much kills player 2 have in team: " + '"' + firstTeam + '"');
            player2Team1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("How much kills player 3 have in team: " + '"' + firstTeam + '"');
            player3Team1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("How much kills player 4 have in team: " + '"' + firstTeam + '"');
            player4Team1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("How much kills player 5 have in team: " + '"' + firstTeam + '"');
            player5Team1 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Error");
            return;
        }

        // Second Team
        System.out.println("Write second Team: ");
        String secondTeam = scanner.nextLine();

        int player1Team2, player2Team2, player3Team2, player4Team2, player5Team2;

        System.out.println("How much kills player 1 have in team: " + '"' + secondTeam + '"');
        if (scanner.hasNextInt()) {
            player1Team2 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("How much kills player 2 have in team: " + '"' + secondTeam + '"');
            player2Team2 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("How much kills player 3 have in team: " + '"' + secondTeam + '"');
            player3Team2 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("How much kills player 4 have in team: " + '"' + secondTeam + '"');
            player4Team2 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("How much kills player 5 have in team: " + '"' + secondTeam + '"');
            player5Team2 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Error");
            return;
        }

        // First team average kills
        int sum = (player1Team1 + player2Team1 + player3Team1 + player4Team1 + player5Team1) / 5;
        System.out.println("Team: " + '"' + firstTeam + '"' + " has average " + sum + " kills");

        // Second team average kills
        int sum2 = (player1Team2 + player2Team2 + player3Team2 + player4Team2 + player5Team2) / 5;
        System.out.println("Team: " + '"' + secondTeam + '"' + " has average " + sum2 + " kills");

        // Who win?
        if (sum > sum2) {
            System.out.println("Team: " + '"' + firstTeam + '"' + " WIN!");
        } else {
            System.out.println("Team: " + '"' + secondTeam + '"' + " WIN!");
        }
    }
}
