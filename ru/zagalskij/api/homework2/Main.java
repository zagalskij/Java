package ru.zagalskij.api.homework2;

import java.util.Scanner;

import org.json.JSONArray;

import ru.zagalskij.api.homework1.Calculator;

public class Main {
    static Scanner scanner = new Scanner(System.in);
         

   public static void main(String[] args){
        
    
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
                    break;
                }
                case 3: {
                    Task3 t3 = new Task3();
                    String currentDirectory = System.getProperty("user.dir");
                    JSONArray json = t3.readFromFile(currentDirectory + "/ru/zagalskij/api/homework2/output.txt");
                    t3.saveToFile(t3.parseJson(json).toString(), currentDirectory + "/ru/zagalskij/api/homework2/result.txt");
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
