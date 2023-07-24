package ru.zagalskij.api.homework4;

import org.json.JSONArray;
import ru.zagalskij.api.homework1.Calculator;
import ru.zagalskij.api.homework2.Array;
import ru.zagalskij.api.homework2.Task1;
import ru.zagalskij.api.homework2.Task3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args){


        boolean f = true;
        while (f) {
            System.out.println("Select a task: ");
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("0 - Завершение работы приложения");
            int no = Integer.parseInt(scanner.nextLine());

            switch (no) {
                case 1: {
                    MyLinkedList l1 = new MyLinkedList();
                    LinkedList<Integer> linkedList1 = l1.fillRandomALinkedList();
                    System.out.printf("Original List: %s\n", linkedList1);
                    LinkedList<Integer> reverseList1 = l1.reverseList(linkedList1);
                    System.out.printf("Reversed List: %s\n", reverseList1);
                    break;
                }
                case 2: {
                    MyQueue<Integer> queue = new MyQueue<>();
                    queue.enqueue(1);
                    queue.enqueue(2);
                    queue.enqueue(3);
                    System.out.println("First element: " + queue.first());
                    System.out.println("Dequeued element: " + queue.dequeue());
                    System.out.println("Size: " + queue.size());
                    System.out.println("Is empty: " + queue.isEmpty());
                    break;
                }
                case 3: {
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
