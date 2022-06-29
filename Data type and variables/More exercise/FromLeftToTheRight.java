package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String firstNum = input[0];
            String secondNum = input[1];
            long number1 = Long.parseLong(firstNum);
            long number2 = Long.parseLong(secondNum);
            if (number1 > number2) {
                int sumFirstNum = 0;
                while (number1 != 0) {
                    long digit = number1 % 10;
                    sumFirstNum += digit;
                    number1 /= 10;
                }
                System.out.println(Math.abs(sumFirstNum));
            } else {
                int sumSecondNum = 0;
                while (number2 != 0) {
                    long digit = number2 % 10;
                    sumSecondNum += digit;
                    number2 /= 10;
                }
                System.out.println(Math.abs(sumSecondNum));
            }
        }
    }
}