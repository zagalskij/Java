package ru.zagalskij.api.homework1;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Level;

public class Calculator {
    static Logger logger = Logger.getLogger(Calculator.class.getName());
    static Scanner scanner = new Scanner(System.in);

    static Stack<Double> historyStack = new Stack<>();
    public static void chose() {
        logger.setLevel(Level.INFO);
        try {
            String currentDirectory = System.getProperty("user.dir");
            FileHandler fileHandler = new FileHandler(currentDirectory + "/src/main/java/ru/zagalskij/api/homework2/Calculator.log");
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean f = true;
        while (f) {
            System.out.println("Select a task: ");
            System.out.println("1 - Sum");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Division");
            System.out.println("4 - Multiplication");
            System.out.println("9 - Last operation result");
            System.out.println("0 - Завершение работы приложения");
            int no = Integer.parseInt(scanner.nextLine());

            switch (no) {
                case 1: {
                    System.out.println("enter the first number");
                    Double firstNumber = Double.parseDouble(scanner.nextLine());
                    System.out.println("enter the second number");
                    Double secondNumber = Double.parseDouble(scanner.nextLine());
                    Double sum = firstNumber + secondNumber;
                    System.out.printf("Sum of numbers: %.2f \n", sum);
                    logger.info("Performed addition. Result: " + sum);
                    historyStack.push(sum);
                    break;
                }
                case 2: {
                    System.out.println("enter the first number");
                    Double firstNumber = Double.parseDouble(scanner.nextLine());
                    System.out.println("enter the second number");
                    Double secondNumber = Double.parseDouble(scanner.nextLine());
                    Double subtraction = firstNumber - secondNumber;
                    System.out.printf("The result of subtraction: %.2f \n", subtraction);
                    logger.info("Performed addition. Result: " + subtraction);
                    historyStack.push(subtraction);
                    break;
                }
                case 3: {
                    System.out.println("enter the first number");
                    Double firstNumber = Double.parseDouble(scanner.nextLine());
                    System.out.println("enter the second number");
                    Double secondNumber = Double.parseDouble(scanner.nextLine());
                    Double division = firstNumber / secondNumber;
                    System.out.printf("Division result: %.2f \n", division);
                    logger.info("Performed addition. Result: " + division);
                    historyStack.push(division);
                    break;
                }
                case 4: {
                    System.out.println("enter the first number");
                    Double firstNumber = Double.parseDouble(scanner.nextLine());
                    System.out.println("enter the second number");
                    Double secondNumber = Double.parseDouble(scanner.nextLine());
                    Double multiplication = firstNumber * secondNumber;
                    System.out.printf("The result of multiplication: %.2f \n", multiplication);
                    logger.info("Performed addition. Result: " + multiplication);
                    historyStack.push(multiplication);
                    break;
                }
                case 0:
                    System.out.println("Shutting down the application");
                    f = false;
                    break;
                case 9:
                    if (!historyStack.isEmpty()) {
                        Double lastResult = historyStack.pop();
                        System.out.println("Last operation result was: " + lastResult);
                    } else {
                        System.out.println("No previous operation to undo.");
                    }
                    break;
                default:
                    System.out.println("Invalid task number,\n try entering again");
                    break;
            }
        }
    }
}
