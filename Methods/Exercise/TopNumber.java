package MethodsExercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            if (numberDivisibleBy8(i) && oddNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean numberDivisibleBy8(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        if (sum % 8 == 0) {
            return true;
        }
        return false;
    }

    private static boolean oddNumber(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 1) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
