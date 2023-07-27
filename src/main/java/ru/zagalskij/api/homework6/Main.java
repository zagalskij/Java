package ru.zagalskij.api.homework6;

import ru.zagalskij.api.lesson6.Fraction;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Cat> hashSet = new HashSet<>();
        hashSet.add(new Cat("Pushok",2,"Abyssinian","Brown","Woman"));
        hashSet.add(new Cat("Pushok",2,"Abyssinian","Brown","Woman"));
        hashSet.add(new Cat("Barsik",1,"Abyssinian","Black","Woman"));
        System.out.println(hashSet);
    }
}
