package ru.zagalskij.api.homework4;

import java.util.LinkedList;
import java.util.Random;

public class MyLinkedList {
    public LinkedList<Integer> fillRandomALinkedList() {
        Random r = new Random();
        LinkedList<Integer> linkedList = new LinkedList<>();
        int size = r.nextInt(1, 100);
        for (int i = 0; i < size; i++) {
            linkedList.add(r.nextInt(100));

        }
        return linkedList;
    }
    public LinkedList<Integer>  reverseList(LinkedList<Integer> linkedList){
        LinkedList<Integer> reversedList = new LinkedList<>();
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            reversedList.add(linkedList.get(i));
        }
        return reversedList;
    }
}
