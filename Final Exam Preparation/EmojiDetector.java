package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regexValidEmoji = "(::|\\*\\*)(?<name>[A-Z][a-z]{2,})\\1";
        String regexThreshold = "\\d";

        Pattern patternValidEmoji = Pattern.compile(regexValidEmoji);
        Pattern patternThreshold = Pattern.compile(regexThreshold);

        Matcher matcherValidEmoji = patternValidEmoji.matcher(text);
        Matcher matcherThreshold = patternThreshold.matcher(text);

        Map<String, Integer> validEmojiInfo = new LinkedHashMap<>();

        while (matcherValidEmoji.find()) {
            String validName = matcherValidEmoji.group("name");
            int sumCoolness = 0;
            for (int i = 0; i < validName.length(); i++) {
                char symbol = validName.charAt(i);
                sumCoolness += symbol;
            }
            String nameEmoji = matcherValidEmoji.group();
            validEmojiInfo.put(nameEmoji, sumCoolness);
        }
        int threshold = 1;
        while (matcherThreshold.find()) {
            int number = Integer.parseInt(matcherThreshold.group());
            threshold *= number;
        }
        System.out.printf("Cool threshold: %d%n", threshold);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", validEmojiInfo.size());
        for (Map.Entry<String, Integer> entry : validEmojiInfo.entrySet()) {
            if (entry.getValue() >= threshold) {
                System.out.println(entry.getKey());
            }
        }
    }
}
