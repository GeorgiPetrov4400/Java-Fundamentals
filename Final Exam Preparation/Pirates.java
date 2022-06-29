package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Map<String, Integer> townPeople = new LinkedHashMap();

        Map<String, Integer> townGold = new LinkedHashMap();

        while (!line.equals("Sail")) {
            String[] input = line.split("[\\|\\|]{2}");
            String townName = input[0];
            int people = Integer.parseInt(input[1]);
            int gold = Integer.parseInt(input[2]);
            if (townPeople.containsKey(townName)) {
                townPeople.put(townName, townPeople.get(townName) + people);
            } else {
                townPeople.put(townName, people);
            }
            if (townGold.containsKey(townName)) {
                townGold.put(townName, townGold.get(townName) + gold);
            } else {
                townGold.put(townName, gold);
            }

            line = scanner.nextLine();
        }

        line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] data = line.split("=>");
            String command = data[0];
            String nameOfTown = data[1];
            switch (command) {
                case "Plunder":
                    int peopleKilled = Integer.parseInt(data[2]);
                    int goldStolen = Integer.parseInt(data[3]);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", nameOfTown, goldStolen, peopleKilled);
                    if (townPeople.containsKey(nameOfTown)) {
                        townPeople.put(nameOfTown, townPeople.get(nameOfTown) - peopleKilled);
                        if (townPeople.get(nameOfTown) <= 0) {
                            System.out.printf("%s has been wiped off the map!%n", nameOfTown);
                            townPeople.remove(nameOfTown);
                            townGold.remove(nameOfTown);
                        }
                    }
                    if (townGold.containsKey(nameOfTown)) {
                        townGold.put(nameOfTown, townGold.get(nameOfTown) - goldStolen);
                        if (townGold.get(nameOfTown) <= 0) {
                            System.out.printf("%s has been wiped off the map!%n", nameOfTown);
                            townGold.remove(nameOfTown);
                            townPeople.remove(nameOfTown);
                        }
                    }
                    break;
                case "Prosper":
                    int goldIncrease = Integer.parseInt(data[2]);
                    if (goldIncrease < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                        line = scanner.nextLine();
                        continue;
                    } else {
                        if (townGold.containsKey(nameOfTown)) {
                            townGold.put(nameOfTown, townGold.get(nameOfTown) + goldIncrease);
                            System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",
                                    goldIncrease, nameOfTown, townGold.get(nameOfTown));
                        }
                    }
                    break;
            }

            line = scanner.nextLine();
        }
        if (townPeople.size() > 0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", townPeople.size());
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
            return;
        }
        for (Map.Entry<String, Integer> entry : townPeople.entrySet()) {
            System.out.printf("%s -> Population: %d citizens, ", entry.getKey(), entry.getValue());
            for (Map.Entry<String, Integer> gold : townGold.entrySet()) {
                if (townPeople.containsKey(entry.getKey())) {
                    int goldValue = townGold.get(entry.getKey());
                    System.out.printf("Gold: %d kg%n", goldValue);
                    break;
                }
            }
        }
    }
}
