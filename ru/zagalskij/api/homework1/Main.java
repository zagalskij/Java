package ru.zagalskij.api.homework1;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean f = true;
        while (f) {
            System.out.println("Select a task: ");
            System.out.println("1 - Find a triangular number");
            System.out.println("2 - Find the factorial");
            System.out.println("3 - Find all natural numbers in the limit");
            System.out.println("4 - Calculator");
            System.out.println("5 - Task4");
            System.out.println("0 - Завершение работы приложения");
            int no = Integer.parseInt(scanner.nextLine());

            switch (no) {
                case 1: {
                    System.out.println("enter the number n");
                    int n = Integer.parseInt(scanner.nextLine());
                    int triangleNumber = TriangularNumber.getTriangularNumber(n);
                    System.out.println(triangleNumber);
                    break;
                }
                case 2: {
                    System.out.println("enter the number n");
                    int n = Integer.parseInt(scanner.nextLine());
                    int factorial = Factorial.getFactorial(n);
                    System.out.println(factorial);
                    break;
                }
                case 3: {
                    System.out.println("enter the number n");
                    int n = Integer.parseInt(scanner.nextLine());
                    int[] arr = PrimeNumbers.getPrimeNumbers(n);
                    PrimeNumbers.printArray(arr);
                    break;
                }
                case 4: {
                    Calculator.chose();
                    break;
                }
                case 5: {
                    Task4.getRandomStr();
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
