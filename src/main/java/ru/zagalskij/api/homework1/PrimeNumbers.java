package ru.zagalskij.api.homework1;

import java.util.Arrays;

/**
 * PrimeNumbers
 */
public class PrimeNumbers {

    public static boolean checkPrimeNumbers(int number, int div) {
        if (div > Math.sqrt(number) + 1 || number == 2) {
            return true;
        }
        if (number % div == 0 || number <= 1) {
            return false;
        }
        return checkPrimeNumbers(number, div + 1);
    }

    public static int[] getPrimeNumbers(int n) {
        int j = 0;
        int[] arr = new int[0];
        for (int i = 2; i <= n; i++)
            if (checkPrimeNumbers(i, 2)) {
                arr = Arrays.copyOf(arr, arr.length + 1);
                arr[j] = i;
                j++;
            }
        return arr;
    }

    public static void printArray(int[] arr) {
        
        for (int number : arr) {
    System.out.println(number);
}
    }
}