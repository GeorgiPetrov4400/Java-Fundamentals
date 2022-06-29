package TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        StringBuilder sequence = new StringBuilder();
        char symbol = input.charAt(0);
        char lastSymbol = input.charAt(input.length() - 1);
        for (int i = 0; i < input.length() - 1; i++) {
            // symbol = input.charAt(i);
            char nextSymbol = input.charAt(i + 1);
            if (symbol == nextSymbol) {
                sequence.append(symbol);
            } else {
                if (sequence.length() >= 1) {
                    result.append(symbol);
                    sequence.delete(0, sequence.length());
                    symbol = nextSymbol;
                } else if (sequence.isEmpty()) {
                    result.append(symbol);
                    symbol = nextSymbol;
                }
            }
        }
        result.append(lastSymbol);
        System.out.println(result);
    }
}
