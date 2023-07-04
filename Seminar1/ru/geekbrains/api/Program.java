package ru.geekbrains.api;

import java.util.Scanner;

/**
 * Program
 */
public class Program {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task3("Привет Java");
    }

    static void printName() {
        int i = 12;
        double j = 12.4;
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");
        System.out.printf("Привет, %s ! %d %.2f\n", name, i, j);
    }

    static void task3(String str) {
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.printf("i=%d - j=%d\n", i, j);
        }
        String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.printf("%s ", words[i]);
        }
    }

    static void task2() {
        int counter = 0;
        int max = 0;
        int[] array = { 1, 0, 0, 1, 1, 1, 0, 1 };
        for (int i : array) {
            if (i == 1)
                counter++;
            else {
                if (counter > max)
                    max = counter;
                counter = 0;
            }
        }

    }
}
