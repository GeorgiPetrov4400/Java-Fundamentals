package FinalExamApril2022;

import java.util.*;

public class HeroRecruitment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> heroAndSpell = new LinkedHashMap<>();

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
                        heroAndSpell.putIfAbsent(heroName, new ArrayList<>());
                    }
                    break;
                case "Learn":
                    String spellName = data[2];
                    if (heroAndSpell.containsKey(heroName)) {
                        if (heroAndSpell.get(heroName).isEmpty()) {
                            heroAndSpell.put(heroName, new ArrayList<>());
                            heroAndSpell.get(heroName).add(spellName);
                        } else {
                            if (heroAndSpell.get(heroName).contains(spellName)) {
                                System.out.printf("%s has already learnt %s.%n", heroName, spellName);
                            } else {
                                heroAndSpell.get(heroName).add(spellName);
                            }
                        }
                    } else {
                        System.out.printf("%s doesn't exist.%n", heroName);
                    }
                    break;
                case "Unlearn":
                    String unlearnSpellName = data[2];
                    if (heroAndSpell.containsKey(heroName)) {
                        if (heroAndSpell.get(heroName).contains(unlearnSpellName)) {
                            heroAndSpell.get(heroName).remove(unlearnSpellName);
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
        for (Map.Entry<String, List<String>> entry : heroAndSpell.entrySet()) {
            System.out.printf("== %s: ", entry.getKey());
            for (List<String> value : heroAndSpell.values()) {
                System.out.print(String.join(", ", entry.getValue()));
                break;
            }
            System.out.println();
        }
    }
}
