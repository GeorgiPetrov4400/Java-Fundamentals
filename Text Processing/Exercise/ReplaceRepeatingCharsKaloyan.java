package TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingCharsKaloyan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder result = new StringBuilder(scanner.nextLine());
        for (int i = 0; i < result.length() - 1; i++) {
            char currentSymbol = result.charAt(i);
            char nextSymbol = result.charAt(i + 1);
            if (currentSymbol == nextSymbol) {
                result.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(result);
    }
}
