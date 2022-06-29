package MethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            System.out.println(getPalindromeNumber(input));

            input = scanner.nextLine();
        }
    }

    private static boolean getPalindromeNumber(String input) {
        String palindrome = new StringBuffer(input).reverse().toString();
        int number = Integer.parseInt(input);
        int palindromeNumber = Integer.parseInt(palindrome);
        if (number == palindromeNumber) {
            return true;
        }
        return false;
    }
}
