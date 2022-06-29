package TextProcessingLab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : bannedWords) {
            if (text.contains(word)) {
                String replacement = repeatString("*", word.length());
                text = text.replace(word, replacement);
            }
        }
        System.out.println(text);
    }

    public static String repeatString(String word, int count) {
        String[] repeat = new String[count];
        for (int i = 0; i < count; i++) {
            repeat[i] = word;
        }
        return String.join("", repeat);
    }
}
