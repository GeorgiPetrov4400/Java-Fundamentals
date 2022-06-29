package MethodsLab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(getResult(Math.abs(number)));
    }

    private static int getResult(int num) {
        int oddSum = 0;
        int evenSum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            num /= 10;
        }
        int result = oddSum * evenSum;
        return result;
    }
}
