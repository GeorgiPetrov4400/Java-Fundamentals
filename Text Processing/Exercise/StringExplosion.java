package TextProcessingExercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder text = new StringBuilder(input);

        int strength = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            if (currentSymbol == '>') {
                strength += Integer.parseInt("" + text.charAt(i + 1));
            } else if (currentSymbol != '>' && strength > 0) {
                text.deleteCharAt(i);
                strength--;
                i--;
            }
        }
        System.out.println(text);

      /*  StringBuilder result = new StringBuilder(scanner.nextLine());
        int strength = 0;
        for (int i = 0; i < result.length(); i++) {
            if (strength > 0 && result.charAt(i) != '>') {
                result.deleteCharAt(i);
                strength--;
                i--;
            } else if (result.charAt(i) == '>') {
                strength += Integer.parseInt(String.valueOf(result.charAt(i + 1)));
            }
        }
        System.out.println(result); */
    }
}
