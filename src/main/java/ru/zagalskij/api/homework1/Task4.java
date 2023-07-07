package ru.zagalskij.api.homework1;
import java.util.ArrayList;
import java.util.List;

public class Task4 {
    
    public static List<Integer> solveMissingDigits(String equation) {
        List<Integer> solutions = new ArrayList<>();
        
        // Разделяем уравнение на левую и правую части
        String[] parts = equation.split("=");
        String leftPart = parts[0];
        String rightPart = parts[1];
        
        // Проверяем все комбинации для пропущенных цифр
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                // Заменяем пропущенные цифры на текущие значения
                String equationWithDigits = replaceMissingDigits(leftPart + "=" + rightPart, i, j);
                
                // Проверяем, является ли текущая комбинация решением уравнения
                if (evaluateEquation(equationWithDigits)) {
                    solutions.add(i);
                    solutions.add(j);
                }

            }
        }
        
        return solutions;
    }
    
    public static String replaceMissingDigits(String equation, int digit1, int digit2) {
        // Заменяем первую пропущенную цифру на digit1
        String equationWithDigit1 = equation.replaceFirst("\\?", String.valueOf(digit1));
        
        // Заменяем вторую пропущенную цифру на digit2
        String equationWithDigits = equationWithDigit1.replaceFirst("\\?", String.valueOf(digit2));
        
        return equationWithDigits;
    }
    
    public static boolean evaluateEquation(String equation) {
        String[] parts = equation.split("=");
        String leftPart = parts[0];
        String rightPart = parts[1];
        
        int leftValue = evaluateExpression(leftPart);
        int rightValue = evaluateExpression(rightPart);
        
        return leftValue == rightValue;
    }
    
    public static int evaluateExpression(String expression) {
        // Допустим, что выражение содержит только сложение и вычитание
        String[] terms = expression.split("[+-]");
        int result = Integer.parseInt(terms[0].trim());
        
        for (int i = 1; i < terms.length; i++) {
            if (expression.charAt(terms[i].length()) == '+') {
                result += Integer.parseInt(terms[i].trim());
            } else {
                result -= Integer.parseInt(terms[i].trim());
            }
        }
        
        return result;
    }
    
    public static void Main(String equation) {
        List<Integer> solutions = solveMissingDigits(equation);
        
        if (solutions.isEmpty()) {
            System.out.println("No solutions found.");
        } else {
            System.out.println("Solutions:");
            for (int i = 0; i < solutions.size(); i += 2) {
                int digit1 = solutions.get(i);
                int digit2 = solutions.get(i + 1);
                System.out.println("Digit 1: " + digit1 + ", Digit 2: " + digit2);
            }
        }
    }
}