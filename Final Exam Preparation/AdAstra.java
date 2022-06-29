package FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([#|])(?<item>[A-Z][a-z]+ [A-Z][a-z]+|[A-Z][a-z]+)\\1(?<date>[\\d]{2}\\/[\\d]{2}\\/[\\d]{2})\\1(\\b(?<calories>[0-9]|[1-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9][0-9][0-9]|10000)\\b)\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int sumCalories = 0;
        while (matcher.find()) {
            int calories = Integer.parseInt(matcher.group("calories"));
            sumCalories += calories;
        }
        int days = sumCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);

        Pattern pattern2 = Pattern.compile(regex);
        Matcher matcher2 = pattern2.matcher(input);
        while (matcher2.find()) {
            String item = matcher2.group("item");
            String date = matcher2.group("date");
            String calories = matcher2.group("calories");
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n", item, date, calories);
        }
    }
}
