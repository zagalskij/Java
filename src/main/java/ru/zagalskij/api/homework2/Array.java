// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.
package ru.zagalskij.api.homework2;

import java.io.IOException;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Array {
     Logger logger = Logger.getLogger(Array.class.getName());
    
     public int[] bubbleSort(int[] array) {
         logger.setLevel(Level.INFO);
         logger.setUseParentHandlers(false);
         try {
            String currentDirectory = System.getProperty("user.dir");
            FileHandler fileHandler = new FileHandler(currentDirectory + "/ru/zagalskij/api/homework2/sorting.log");
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int temp = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 1; j < array.length-i; j++) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    logger.info(String.format("replacement %d on %d", array[j], array[j-1]));
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
