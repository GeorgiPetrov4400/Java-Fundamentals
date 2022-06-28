package BasicSintaxConditionalStatementAndLoop;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        for (int i = multiplier; i <= 10; i++) {
            int result = number * i;
            System.out.printf("%d X %d = %d%n", number, i, result);
        }
        if (multiplier > 10) {
            int product = number * multiplier;
            System.out.printf("%d X %d = %d%n", number, multiplier, product);
        }
    }
}
