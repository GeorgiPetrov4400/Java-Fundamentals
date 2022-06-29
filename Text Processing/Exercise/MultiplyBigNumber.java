package TextProcessingExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int multiplier = Integer.parseInt(scanner.nextLine());

        StringBuilder result = new StringBuilder();
        int reminder = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));
            int product = digit * multiplier + reminder;
            if (i == 0) {
                result.insert(0, product);
            } else {
                int digitToAdd = product % 10;
                reminder = product / 10;
                result.insert(0, digitToAdd);
            }
        }
        while (result.charAt(0) == '0' && result.length() > 1) {
            result.deleteCharAt(0);
        }
        System.out.println(result);

       /* BigInteger number = new BigInteger(scanner.nextLine());
        int digit = Integer.parseInt(scanner.nextLine());

        BigInteger result = number.multiply(BigInteger.valueOf(digit));

        System.out.println(result); */
    }
}
