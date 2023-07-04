package ru.zagalskij.api.homework2;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

import ru.zagalskij.api.homework1.Calculator;
import ru.zagalskij.api.homework1.PrimeNumbers;

public class Main {
    static Scanner scanner = new Scanner(System.in);
         Logger logger = Logger.getLogger(Array.class.getName());
                    Class<?> currentClass = Main.class;
                    static String currentDirectory = System.getProperty("user.dir");

                    static FileHandler fh = new FileHandler(currentDirectory + "/ru/zagalskij/api/homework2/log.xml");

                    public static void main(String[] args) {
    
        
    
        boolean f = true;
        while (f) {
            System.out.println("Select a task: ");
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("0 - Завершение работы приложения");
            int no = Integer.parseInt(scanner.nextLine());

            switch (no) {
                case 1: {
                    System.out.println(Task1.run());
                    break;
                }
                case 2: {
                    try {
                    Logger logger = Logger.getLogger(Array.class.getName());
                    logger.addHandler(fh);
                    XMLFormatter xml = new XMLFormatter();
                    fh.setFormatter(xml);
                    logger.log(Level.WARNING, "Тестовое логирование 1");
                    logger.info("Тестовое логирование 2");
                    Array t2 = new Array();
                    System.out.println("enter the size array");
                    int size = Integer.parseInt(scanner.nextLine());
                    System.out.println("enter the maximum value of the array");
                    int maxValue = Integer.parseInt(scanner.nextLine());
                    int[] randomArray = t2.fillRandomArray(size, maxValue);
                    System.out.print("array: ");
                    t2.printArray(randomArray);
                    int[] sortedArray = t2.bubbleSort(randomArray);
                    System.out.print("sorted array: ");
                    t2.printArray(sortedArray);
                    }
                    catch (IOException e) {
                        logger.log(Level.SEVERE, "Ошибка при создании FileHandler", e);
                    }
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
