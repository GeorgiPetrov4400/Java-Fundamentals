package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "(@|#)(?<wordOne>[A-Za-z]{3,})(\\1)(\\1)(?<wordTwo>[A-Za-z]{3,})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        Map<String, String> validMirrorWords = new LinkedHashMap<>();

        int countMirrorWords = 0;
        while (matcher.find()) {
            countMirrorWords++;
            StringBuilder wordOne = new StringBuilder(matcher.group("wordOne"));
            String wordOneString = wordOne.toString();
            String wordOneReverse = String.valueOf(wordOne.reverse());
            String wordTwo = matcher.group("wordTwo");
            String wordTwoString = String.valueOf(wordTwo);
            if (wordOneReverse.equals(wordTwoString)) {
                validMirrorWords.put(wordOneString, wordTwo);
            }
        }
        if (countMirrorWords == 0) {
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        } else {
            System.out.printf("%d word pairs found!%n", countMirrorWords);
            if (validMirrorWords.size() == 0) {
                System.out.println("No mirror words!");
            } else {
                System.out.println("The mirror words are:");
                int count = 0;
                for (Map.Entry<String, String> entry : validMirrorWords.entrySet()) {
                    count++;
                    System.out.printf("%s <=> %s", entry.getKey(), entry.getValue());
                    if (count == validMirrorWords.size()) {
                        break;
                    }
                    System.out.print(", ");
                }
            }
        }
    }
}
