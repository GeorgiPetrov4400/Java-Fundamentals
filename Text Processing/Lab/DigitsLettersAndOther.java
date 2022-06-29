package TextProcessingLab;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder otherCharacters = new StringBuilder();

        char[] arraySymbol = input.toCharArray();
        for (int i = 0; i < arraySymbol.length; i++) {
            char symbol = arraySymbol[i];
            if (symbol >= 48 && symbol <= 57) {
                digits.append(symbol);
            } else if (symbol >= 65 && symbol <= 90 || symbol >= 97 && symbol <= 122) {
                letters.append(symbol);
            } else {
                otherCharacters.append(symbol);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(otherCharacters);
    }
}
