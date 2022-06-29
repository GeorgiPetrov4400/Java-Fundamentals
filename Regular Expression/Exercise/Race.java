package RegularExpressionExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        Map<String, Integer> personDistances = new LinkedHashMap<>();
        names.forEach(name -> personDistances.put(name, 0));

        String regexLetter = "[A-Z]*[a-z]*";
        Pattern patternLetter = Pattern.compile(regexLetter);

        String regexDigit = "[0-9]";
        Pattern patternDigit = Pattern.compile(regexDigit);

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            StringBuilder namePerson = new StringBuilder();
            Matcher matcherName = patternLetter.matcher(input);
            while (matcherName.find()) {
                namePerson.append(matcherName.group());
            }

            StringBuilder distancePerson = new StringBuilder();
            Matcher matcherDistance = patternDigit.matcher(input);
            int sumDigits = 0;
            while (matcherDistance.find()) {
                int digit = Integer.parseInt(matcherDistance.group());
                sumDigits += digit;
            }
            distancePerson.append(sumDigits);
            if (personDistances.containsKey(String.valueOf(namePerson))) {
                int currentDistance = Integer.parseInt(String.valueOf(distancePerson));
                personDistances.put(String.valueOf(namePerson), personDistances.get(String.valueOf(namePerson)) + currentDistance);
            } else {
                input = scanner.nextLine();
                continue;
            }
            input = scanner.nextLine();
        }

      /*  Map<String, Integer> firstThreePerson = personDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a1, a2) -> a1, LinkedHashMap::new)); */

        List<String> firstThreePeople = personDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3)
                .map(entry -> entry.getKey()).collect(Collectors.toList());

        System.out.printf("1st place: %s%n", firstThreePeople.get(0));
        System.out.printf("2nd place: %s%n", firstThreePeople.get(1));
        System.out.printf("3rd place: %s%n", firstThreePeople.get(2));
    }
}

