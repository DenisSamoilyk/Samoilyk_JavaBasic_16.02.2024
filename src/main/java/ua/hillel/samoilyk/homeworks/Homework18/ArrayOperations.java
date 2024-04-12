package ua.hillel.samoilyk.homeworks.Homework18;

public class ArrayOperations {

    // Метод на середнє арифметичне
    public static double calculateAverage(int[] array) {

        if (array == null) {
            System.out.println("Error. NullPointerException");
            return 0;
        }

        // Якщо нуль, писати попередження
        if (array.length == 0) {
            System.out.println("Array must not be empty");
        }

        double sum = 0;

        // Розбиває array на num і підраховує середні арифметичне
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Метод на квадратну матрицю
    public static boolean isSquareMatrix(int[][] matrix) {

        if (matrix == null) {
            System.out.println("Error. NullPointerException");
            return false;
        }

        // Якщо нуль, повертає false
        if (matrix.length == 0) {
            System.out.println("Matrix must not be empty");
            return false;
        }

        // Якщо довжина не збігається з іншими, видавати false
        for (int[] row : matrix) {
            if (row.length != matrix.length) {
                return false;
            }
        }
        return true;
    }


}
