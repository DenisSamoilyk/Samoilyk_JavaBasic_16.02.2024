package ua.hillel.samoilyk.homeworks.Homework11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M;
        int N;

        // Перевірка "M" на число
        System.out.print("Enter M: ");
        if (scanner.hasNextInt()) {
            M = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Error, write a number!");
            return;
        }

        // Перевірка "N" на число
        System.out.print("Enter N: ");
        if (scanner.hasNextInt()) {
            N = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Error, write a number!");
            return;
        }


        int[][] arrayOne = new int[M][N];
        int[][] arrayTwo = new int[N][M];

        System.out.println("Array 1:");

        // Заповнення числами та написання arrayOne
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                arrayOne[i][j] = (int) (Math.random() * 10);
                System.out.print(arrayOne[i][j] + "  ");
            }
            System.out.println();
        }

        // Транспоновання матриці з arrayOne в arrayTwo
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                arrayTwo[j][i] = arrayOne[i][j];
            }
        }

        System.out.println();
        System.out.println("Array 2 after transposing:");

        // Виведення array2 після транспонування
        for (int[] row : arrayTwo) {
            for (int element : row) {
                System.out.print(element + "  ");
            }
            System.out.println();
        }


    }
}
