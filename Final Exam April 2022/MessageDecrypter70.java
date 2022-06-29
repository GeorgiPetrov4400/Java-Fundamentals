package FinalExamApril2022;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageDecrypter70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();

            String regexValidMessage = "(\\$|%)(?<tag>[A-Z][a-z]{2,})\\1: ";
            String regexNumbers = "[\\d]+";

            Pattern validMessage = Pattern.compile(regexValidMessage);
            Pattern validNumbers = Pattern.compile(regexNumbers);

            Matcher matcherValidMessage = validMessage.matcher(line);
            Matcher matcherValidNumbers = validNumbers.matcher(line);

            if (matcherValidMessage.find()) {
                String validTag = matcherValidMessage.group("tag");
                StringBuilder message = new StringBuilder();
                int countNumbers = 0;
                while (matcherValidNumbers.find()) {
                    countNumbers++;
                    int number = Integer.parseInt(matcherValidNumbers.group());
                    char symbol = (char) number;
                    message.append(symbol);
                }
                if (countNumbers > 3) {
                    System.out.println("Valid message not found!");
                    message.setLength(0);
                } else {
                    System.out.printf("%s: %s%n", validTag, message);
                    message.setLength(0);
                }
            } else {
                System.out.println("Valid message not found!");
            }
        }
    }
}
