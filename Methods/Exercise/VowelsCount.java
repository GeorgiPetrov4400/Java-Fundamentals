package MethodsExercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("");

        System.out.println(getVowelsCount(input));
    }

    private static int getVowelsCount(String[] text) {
        int vowelsCount = 0;
        for (char i = 0; i < text.length; i++) {
            String symbol = text[i];
            if (symbol.equals("a") || symbol.equals("e") || symbol.equals("i") || symbol.equals("o") ||
                    symbol.equals("u") || symbol.equals("A") || symbol.equals("E") || symbol.equals("I") ||
                    symbol.equals("O") || symbol.equals("U")) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
