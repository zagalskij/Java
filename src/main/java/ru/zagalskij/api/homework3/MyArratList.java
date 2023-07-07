package ru.zagalskij.api.homework3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class MyArratList {
    public ArrayList<Integer> fillRandomArrayList() {
        Random r = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = r.nextInt(1, 100);
        for (int i = 0; i < size; i++) {
            arrayList.add(r.nextInt(100));

        }
        return arrayList;
    }

    public void printArrayList(ArrayList<Integer> arrayList) {
        for (Integer value : arrayList
        ) {
            System.out.printf("%d ", value);
        }
        System.out.println();
    }
    public ArrayList<Integer> removeEvenNumbers(ArrayList<Integer> arrayList) {
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        return arrayList;
    }
    public int findMinimum(ArrayList<Integer> arrayList) {
        int min = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            int number = arrayList.get(i);
            if (number < min) {
                min = number;
            }
        }

        return min;
    }
    public double calculateAverage(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int number : arrayList) {
            sum += number;
        }

        return (double) sum / arrayList.size();
    }
}
