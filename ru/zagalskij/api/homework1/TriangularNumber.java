package ru.zagalskij.api.homework1;

/**
 * TriangularNumber
 */
public class TriangularNumber {

    public static int getTriangularNumber(int n) {
        n = (n * (n + 1)) / 2;
        return n;
    }
}