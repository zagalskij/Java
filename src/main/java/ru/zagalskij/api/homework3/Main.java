package ru.zagalskij.api.homework3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArratList a1 = new MyArratList();
        ArrayList<Integer> arrayList1 = a1.fillRandomArrayList();
        a1.printArrayList(arrayList1);
        a1.removeEvenNumbers(arrayList1);
        a1.printArrayList(arrayList1);
        System.out.println(a1.findMinimum(arrayList1));
        System.out.println(a1.calculateAverage(arrayList1));

    }
}
