package ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i <= numbers.length - 1; i++) {

            boolean isTop = false;
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                if (numbers[i] > numbers[j]) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println(numbers[numbers.length - 1]);
    }
}
