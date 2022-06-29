package FinalExamApril2022;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageDecrypter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();

            String regexValidMessage = "\\B([\\$|%])(?<tag>[A-Z][a-z]{2,})\\1:\\s(?<symbol>(\\[\\d+\\]\\|){3,})\\B";

            Pattern validMessage = Pattern.compile(regexValidMessage);

            Matcher matcherValidMessage = validMessage.matcher(line);

            if (matcherValidMessage.find()) {
                String validTag = matcherValidMessage.group("tag");
                String numbers = matcherValidMessage.group("symbol");
                String regexNumbers = "\\d+";
                Pattern pattern = Pattern.compile(regexNumbers);
                Matcher matcher = pattern.matcher(numbers);
                StringBuilder message = new StringBuilder();
                int countNumbers = 0;
                while (matcher.find()) {
                    countNumbers++;
                    int asciiNum = Integer.parseInt(matcher.group());
                    char symbol = (char) asciiNum;
                    message.append(symbol);
                }
                if (countNumbers > 3) {
                    System.out.println("Valid message not found!");
                    message.setLength(0);
                } else {
                    System.out.printf("%s: %s%n", validTag, message);
                }
            } else {
                System.out.println("Valid message not found!");
            }
        }
    }
}
