package MethodsMoreExercise;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String input2 = scanner.nextLine();
        if (input.equals("int")) {
            printInteger(Integer.parseInt(input2));
        } else if (input.equals("real")) {
            printDouble(Double.parseDouble(input2));
        } else {
            printString(input2);
        }
    }

    private static void printInteger(int input) {
        int result = input * 2;
        System.out.println(result);
    }

    private static void printDouble(double input) {
        double result = input * 1.5;
        System.out.printf("%.2f%n", result);
    }

    private static void printString(String input) {
        System.out.printf("$%s$", input);
    }
}
