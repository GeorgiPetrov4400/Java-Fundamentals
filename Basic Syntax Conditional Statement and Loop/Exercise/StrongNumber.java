package BasicSintaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sumNumber = number;

        int digit = 0;
        int factorial = 1;
        int sumFactoriel = 0;

        while (number > 0) {
            digit = number % 10;
            for (int i = 1; i <= digit; i++) {
                factorial = factorial * i;
            }
            sumFactoriel += factorial;
            factorial = 1;
            number = number / 10;

        }
        if (sumFactoriel == sumNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
