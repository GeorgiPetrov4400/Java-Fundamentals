package RegularExpressionExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        String regexKey = "[starSTAR]";
        Pattern patternKey = Pattern.compile(regexKey);
        for (int i = 0; i < n; i++) {
            String cryptedMessage = scanner.nextLine();
            Matcher matcherKey = patternKey.matcher(cryptedMessage);
            int countLetters = 0;
            while (matcherKey.find()) {
                countLetters++;
            }
            StringBuilder encryptedMessage = new StringBuilder();
            for (int j = 0; j < cryptedMessage.length(); j++) {
                char symbol = (char) (cryptedMessage.charAt(j) - countLetters);
                encryptedMessage.append(symbol);
            }
            Pattern pattern = Pattern.compile("[^@!:>-]*?(?<planetName>[A-Z][a-z]+)[^@!>-]*?:(?<population>\\d+)[^@>-]*?!(?<attackType>A|D)![^@!]*?->(?<soldiers>\\d+)");
            Matcher matcher = pattern.matcher(encryptedMessage);
            while (matcher.find()) {
                String planet = matcher.group("planetName");
                String attackType = matcher.group("attackType");
                if (attackType.equals("A")) {
                    attackedPlanets.add(planet);
                } else if (attackType.equals("D")) {
                    destroyedPlanets.add(planet);
                }
            }
            encryptedMessage = null;
        }
        Collections.sort(attackedPlanets);
        System.out.printf("Attacked planets: %d%n", attackedPlanets.size());
        for (String planet : attackedPlanets) {
            System.out.printf("-> %s%n", planet);
        }
        Collections.sort(destroyedPlanets);
        System.out.printf("Destroyed planets: %d%n", destroyedPlanets.size());
        for (String planet : destroyedPlanets) {
            System.out.printf("-> %s%n", planet);
        }
    }
}
