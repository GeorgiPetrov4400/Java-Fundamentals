package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heroesNumber = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> heroNameAndHP = new LinkedHashMap<>();

        Map<String, Integer> heroNameAndMP = new LinkedHashMap<>();

        for (int i = 0; i < heroesNumber; i++) {
            String[] input = scanner.nextLine().split(" ");
            String heroName = input[0];
            int heroHP = Integer.parseInt(input[1]);
            int heroMP = Integer.parseInt(input[2]);
            heroNameAndHP.put(heroName, heroHP);
            heroNameAndMP.put(heroName, heroMP);
        }

        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] data = line.split(" - ");
            String command = data[0];
            String nameHero = data[1];

            switch (command) {
                case "CastSpell":
                    int neededMP = Integer.parseInt(data[2]);
                    String spellName = data[3];
                    if (heroNameAndMP.containsKey(nameHero)) {
                        int points = Integer.parseInt(String.valueOf(heroNameAndMP.get(nameHero)));
                        if (points >= neededMP) {
                            points = points - neededMP;
                            System.out.printf("%s has successfully cast %s and now has %d MP!%n",
                                    nameHero, spellName, points);
                            heroNameAndMP.put(nameHero, points);
                        } else {
                            System.out.printf("%s does not have enough MP to cast %s!%n", nameHero, spellName);
                        }
                    } else {
                        line = scanner.nextLine();
                        continue;
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(data[2]);
                    String attacker = data[3];
                    if (heroNameAndHP.containsKey(nameHero)) {
                        int points = Integer.parseInt(String.valueOf(heroNameAndHP.get(nameHero)));
                        if (points > damage && points > 0) {
                            points = points - damage;
                            System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",
                                    nameHero, damage, attacker, points);
                            heroNameAndHP.put(nameHero, points);
                        } else {
                            heroNameAndHP.remove(nameHero);
                            heroNameAndMP.remove(nameHero);
                            System.out.printf("%s has been killed by %s!%n", nameHero, attacker);
                        }
                    } else {
                        line = scanner.nextLine();
                        continue;
                    }
                    break;
                case "Recharge":
                    int amount = Integer.parseInt(data[2]);
                    if (heroNameAndMP.containsKey(nameHero)) {
                        int points = Integer.parseInt(String.valueOf(heroNameAndMP.get(nameHero)));
                        points = points + amount;
                        if (points > 200) {
                            int difference = points - 200;
                            int manaPoints = amount - difference;
                            points = 200;
                            System.out.printf("%s recharged for %d MP!%n", nameHero, manaPoints);
                            heroNameAndMP.put(nameHero, points);
                            break;
                        }
                        System.out.printf("%s recharged for %d MP!%n", nameHero, amount);
                        heroNameAndMP.put(nameHero, points);
                    } else {
                        line = scanner.nextLine();
                        continue;
                    }
                    break;
                case "Heal":
                    int amount2 = Integer.parseInt(data[2]);
                    if (heroNameAndHP.containsKey(nameHero)) {
                        int points = Integer.parseInt(String.valueOf(heroNameAndHP.get(nameHero)));
                        points = points + amount2;
                        if (points > 100) {
                            int difference = points - 100;
                            int healingPoints = amount2 - difference;
                            points = 100;
                            System.out.printf("%s healed for %d HP!%n", nameHero, healingPoints);
                            heroNameAndHP.put(nameHero, points);
                            break;
                        }
                        System.out.printf("%s healed for %d HP!%n", nameHero, amount2);
                        heroNameAndHP.put(nameHero, points);
                    } else {
                        line = scanner.nextLine();
                        continue;
                    }
                    break;
            }

            line = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : heroNameAndHP.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println("  HP: " + entry.getValue());
            for (Map.Entry<String, Integer> entryMP : heroNameAndMP.entrySet()) {
                if (heroNameAndHP.containsKey(entry.getKey())) {
                    int value = heroNameAndMP.get(entry.getKey());
                    System.out.println("  MP: " + value);
                    break;
                }
            }
        }
    }
}
