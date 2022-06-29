package FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([=/])(?<destination>[A-Z][A-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> destinations = new ArrayList<>();
        int travelPoint = 0;
        while (matcher.find()) {
            destinations.add(matcher.group("destination"));
            int point = matcher.group().length() - 2;
            travelPoint += point;
        }
        System.out.print("Destinations: ");
        int count = 0;
        for (String destination : destinations) {
            count++;
            System.out.print(destination);
            if (count == destinations.size()) {
                break;
            }
            System.out.print(", ");
        }
        System.out.println();
        System.out.printf("Travel Points: %d", travelPoint);
    }
}
