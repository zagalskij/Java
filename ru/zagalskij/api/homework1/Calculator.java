package ru.zagalskij.api.homework1;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void chose() {
        boolean f = true;
        while (f) {
            System.out.println("Select a task: ");
            System.out.println("1 - Sum");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Division");
            System.out.println("4 - Multiplication");
            System.out.println("0 - Завершение работы приложения");
            int no = Integer.parseInt(scanner.nextLine());

            switch (no) {
                case 1: {
                    System.out.println("enter the first number");
                    Double firstNumber = Double.parseDouble(scanner.nextLine());
                    System.out.println("enter the second number");
                    Double secondNumber = Double.parseDouble(scanner.nextLine());
                    System.out.printf("Sum of numbers: %.2f \n", firstNumber + secondNumber);
                    break;
                }
                case 2: {
                    System.out.println("enter the first number");
                    Double firstNumber = Double.parseDouble(scanner.nextLine());
                    System.out.println("enter the second number");
                    Double secondNumber = Double.parseDouble(scanner.nextLine());
                    System.out.printf("The result of subtraction: %.2f \n", firstNumber - secondNumber);
                    break;
                }
                case 3: {
                    System.out.println("enter the first number");
                    Double firstNumber = Double.parseDouble(scanner.nextLine());
                    System.out.println("enter the second number");
                    Double secondNumber = Double.parseDouble(scanner.nextLine());
                    System.out.printf("Division result: %.2f \n", firstNumber / secondNumber);
                    break;
                }
                case 4: {
                    System.out.println("enter the first number");
                    Double firstNumber = Double.parseDouble(scanner.nextLine());
                    System.out.println("enter the second number");
                    Double secondNumber = Double.parseDouble(scanner.nextLine());
                    System.out.printf("The result of multiplication: %.2f \n", firstNumber * secondNumber);
                    break;
                }
                case 0:
                    System.out.println("Shutting down the application");
                    f = false;
                    break;
                default:
                    System.out.println("Invalid task number,\n try entering again");
                    break;
            }
        }
    }
}
