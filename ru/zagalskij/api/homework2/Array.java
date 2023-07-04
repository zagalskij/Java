// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.
package ru.zagalskij.api.homework2;

import java.util.Random;
import java.util.logging.Level;

public class Array {
    public int[] bubbleSort(int[] array) {
        logger.log(Level.WARNING, "Тестовое логирование 1");
        int temp = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 1; j < array.length-i; j++) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
        
    }

    public int[] fillRandomArray(int size,int maxValue) {
        int[] array = new int[size];
        Random random = new Random();
         for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(maxValue); 
        }

        return array;
    }
     public void printArray(int[] array) {
         for (int i = 0; i < array.length; i++) {
             System.out.printf("%d ", array[i]);
         }
        System.out.println();
    }   
}
