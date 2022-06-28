package ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int length = 1;
        int maxLength = 0;
        int num = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                length++;
            } else {
                length = 1;
            }
            if (length > maxLength) {
                maxLength = length;
                num = numbers[i];
            }
        }
        for (int i = 0; i < maxLength; i++) {
            System.out.print(num + " ");
        }
    }
}
