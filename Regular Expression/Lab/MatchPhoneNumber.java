package RegularExpressionLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.nextLine();
        String regex = "(\\+359)([ -])(2)\\2(\\d{3})\\2(\\d{4})\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numbers);

        List<String> validNumber = new ArrayList<>();

        while (matcher.find()) {
            validNumber.add(matcher.group());
        }
        System.out.print(String.join(", ", validNumber));
    }
}
