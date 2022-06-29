package TextProcessingExercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char symbol = line.charAt(i);
            char encryptedSymbol = (char) (symbol + 3);
            encryptedText.append(encryptedSymbol);
        }
        System.out.println(encryptedText);
    }
}
