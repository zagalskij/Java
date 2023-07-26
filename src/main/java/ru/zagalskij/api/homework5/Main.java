package ru.zagalskij.api.homework5;

import ru.zagalskij.api.lesson5.Student;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TelephoneDirectory t1= new TelephoneDirectory();
        t1.add("Ivanov", "1234567890");
        t1.add("Ivanov", "1234567899");
        t1.add("Petrov", "9876543210");
        System.out.println(t1.telephoneDirectory);
        System.out.println("Phone numbers for the surname Ivanov: " + t1.get("Ivanov"));
        System.out.println("Phone numbers for the surname Zagalskij: " + t1.get("Zagalskij"));
        System.out.println("Phone numbers for the surname Petrov: " + t1.get("Petrov"));
    }
}
