package ArraysLab;

import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        for (int repetitions = 0; repetitions < numbers.length - 1; repetitions++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i] + numbers[i + 1];
            }
        }
        System.out.println(numbers[0]);
    }
}
