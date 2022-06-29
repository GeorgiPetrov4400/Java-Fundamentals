package TextProcessingExercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");

        double totalSum = 0;
        for (String input : line) {
            char firstLetter = input.charAt(0);
            char lastLetter = input.charAt(input.length() - 1);

            StringBuilder number = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char symbol = input.charAt(i);
                if (symbol >= 48 && symbol <= 57) {
                    number.append(symbol);
                }
            }
            double sum = 0;
            double digit = Double.parseDouble(String.valueOf(number));
            if (firstLetter >= 65 && firstLetter <= 90) {
                int letterPosition = firstLetter - 64;
                sum += digit / letterPosition;
            } else {
                int letterPosition = firstLetter - 96;
                sum += digit * letterPosition;
            }
            if (lastLetter >= 65 && lastLetter <= 90) {
                int letterPosition = lastLetter - 64;
                sum = sum - letterPosition;
                totalSum += sum;
            } else {
                int letterPosition = lastLetter - 96;
                sum = sum + letterPosition;
                totalSum += sum;
            }
        }
        System.out.printf("%.2f", totalSum);
    }
}