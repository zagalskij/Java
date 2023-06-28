package ru.zagalskij.api.homework1;

import java.util.Random;

public class Task4 {
    static Random random = new Random();

    public static String getRandomStr() {
        String str = new String(new char[] { getRandomChar(), getRandomChar() }) +
                "+" + new String(new char[] { getRandomChar(), getRandomChar() }) +
                "=" + new String(new char[] { getRandomChar(), getRandomChar() });
                System.out.println(str);
        return str;
    }

    public static char getRandomChar() {
        int randInt = random.nextInt(2);
        char c = (randInt == 0) ? '?' : (char) (random.nextInt(10) + '0');
        return c;
    }

    public static void findEquation() {
        
    }

}
