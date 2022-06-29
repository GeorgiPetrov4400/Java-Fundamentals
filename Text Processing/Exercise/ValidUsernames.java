package TextProcessingExercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (String text : input) {
            StringBuilder validPassword = new StringBuilder();
            if (text.length() >= 3 && text.length() <= 16) {
                for (int i = 0; i < text.length(); i++) {
                    char symbol = text.charAt(i);
                    if (symbol >= 65 && symbol <= 90 || symbol >= 97 && symbol <= 122 ||
                            symbol >= 48 && symbol <= 57 || symbol == 45 || symbol == 95) {
                        validPassword.append(symbol);
                    } else {
                        break;
                    }
                }
            } else {
                continue;
            }
            if (text.length() == validPassword.length()) {
                System.out.println(validPassword);
            }
        }
    }
}
