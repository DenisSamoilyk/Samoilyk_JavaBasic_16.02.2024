package ua.hillel.samoilyk.homeworks.Homework18;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestArrayOperations {

    // Тест на середнє арифметичне
    @Test
    void testCalculateAverage() {
        int[] array = {1, 2, 3, 4, 5};
        double expected = 3.0;
        assertEquals(expected, ArrayOperations.calculateAverage(array));
    }

    // Тест на квадратну матрицю
    @Test
    void testIsSquareMatrix() {
        int[][] squareMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertTrue(ArrayOperations.isSquareMatrix(squareMatrix));

        int[][] nonSquareMatrix = {{1, 2, 3}, {4, 5, 6}};
        assertFalse(ArrayOperations.isSquareMatrix(nonSquareMatrix));
    }


}
