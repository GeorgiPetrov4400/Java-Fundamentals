package RegularExpressionLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(?<date>\\d{2})([./-])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
          //  System.out.printf("Day: %s, Month: %s, Year: %s%n", matcher.group(1), matcher.group(3), matcher.group(4));
            System.out.printf("Day: %s, Month: %s, Year: %s%n",
                    matcher.group("date"), matcher.group("month"), matcher.group("year"));
        }
    }
}
