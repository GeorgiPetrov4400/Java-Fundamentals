package MethodsExercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        double result = getFirstFactorialResult(firstNum) / getSecondFactorialResult(secondNum);
        System.out.printf("%.2f", result);
    }

    private static double getFirstFactorialResult(int firstNum) {
        double resultFirstFactorial = 1;
        for (int i = 1; i <= firstNum; i++) {
            resultFirstFactorial *= i;
        }
        return resultFirstFactorial;
    }

    private static double getSecondFactorialResult(int secondNum) {
        double resultSecondFactorial = 1;
        for (int i = 1; i <= secondNum; i++) {
            resultSecondFactorial *= i;
        }
        return resultSecondFactorial;
    }
}
