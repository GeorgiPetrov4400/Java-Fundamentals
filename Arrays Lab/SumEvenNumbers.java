package ArraysLab;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] arrayNumbers = input.split(" ");
        int[] numbers = new int[arrayNumbers.length];

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(arrayNumbers[i]);
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        System.out.println(sum);
    }
}
