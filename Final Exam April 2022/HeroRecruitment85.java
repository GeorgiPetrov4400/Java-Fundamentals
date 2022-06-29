package FinalExamApril2022;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroRecruitment85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> heroAndSpell = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] data = input.split("\\s+");
            String command = data[0];
            String heroName = data[1];
            switch (command) {
                case "Enroll":
                    if (heroAndSpell.containsKey(heroName)) {
                        System.out.printf("%s is already enrolled.%n", heroName);
                    } else {
                        heroAndSpell.put(heroName, null);
                    }
                    break;
                case "Learn":
                    String spellName = data[2];
                    if (heroAndSpell.containsKey(heroName)) {
                        if (heroAndSpell.get(heroName) == null) {
                            heroAndSpell.put(heroName, spellName);
                        } else if (heroAndSpell.get(heroName).equals(spellName)) {
                            System.out.printf("%s has already learnt %s.%n", heroName, spellName);
                        }
                    } else {
                        System.out.printf("%s doesn't exist.%n", heroName);
                    }
                    break;
                case "Unlearn":
                    String unlearnSpellName = data[2];
                    if (heroAndSpell.containsKey(heroName)) {
                        if (heroAndSpell.get(heroName).contains(unlearnSpellName)) {
                            heroAndSpell.put(heroName, null);
                        } else {
                            System.out.printf("%s doesn't know %s.%n", heroName, unlearnSpellName);
                        }
                    } else {
                        System.out.printf("%s doesn't exist.%n", heroName);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println("Heroes:");
        for (Map.Entry<String, String> entry : heroAndSpell.entrySet()) {
            System.out.printf("== %s:", entry.getKey());
            if (entry.getValue() == null) {
                System.out.println(" ");
            } else {
                System.out.printf(" %s%n", entry.getValue());
            }
        }
    }
}
