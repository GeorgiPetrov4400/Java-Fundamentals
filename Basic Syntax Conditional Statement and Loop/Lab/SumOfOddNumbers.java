package BasicSintaxConditionalStatementAndLoop;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int oddSum = 0;
        for (int i = 1; i <= n * 2; i += 2) {
            oddSum += i;
            System.out.println(i);
        }
        System.out.printf("Sum: %d", oddSum);
    }
}
