package ru.zagalskij.api.homework5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TelephoneDirectory {
    HashMap<String, List<String>> telephoneDirectory = new HashMap<>();
    String telephoneNumber;
    String surName;

    public TelephoneDirectory(String surName, String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        this.surName = surName;
    }

    public TelephoneDirectory() {
    }

    ;

    public void add(String surName, String telephoneNumber) {
        List<String> phoneNumbers = telephoneDirectory.getOrDefault(surName, new ArrayList<>());
        phoneNumbers.add(telephoneNumber);
        telephoneDirectory.put(surName, phoneNumbers);
    }

    public List<String> get(String surName) {
        return telephoneDirectory.getOrDefault(surName, new ArrayList<>());
    }

}