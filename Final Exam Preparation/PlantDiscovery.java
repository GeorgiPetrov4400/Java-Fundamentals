package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plantRarity = new LinkedHashMap<>();

        Map<String, Double> plantRating = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("<->");
            String plantName = line[0];
            int rarity = Integer.parseInt(line[1]);
            plantRarity.putIfAbsent(plantName, 0);
            plantRating.putIfAbsent(plantName, 0.0);
            plantRarity.put(plantName, rarity);
        }

        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String[] data = input.split("[: -]+");
            String command = data[0];
            String plant = data[1];

            if (!plantRarity.containsKey(plant)) {
                System.out.println("error");
                input = scanner.nextLine();
                continue;
            }
            switch (command) {
                case "Rate":
                    double rating = Double.parseDouble(data[2]);
                    if (plantRating.get(plant) == 0) {
                        plantRating.put(plant, rating);
                    } else {
                        double currentRating = plantRating.get(plant);
                        double averageRating = (currentRating + rating) / 2;
                        plantRating.put(plant, averageRating);
                    }
                    break;
                case "Update":
                    int rarity = Integer.parseInt(data[2]);
                    plantRarity.put(plant, rarity);
                    break;
                case "Reset":
                    String plantToReset = data[1];
                    if (plantRating.containsKey(plantToReset)) {
                        plantRating.put(plantToReset, 0.0);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plantRarity.entrySet().stream().forEach(entry -> {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",
                    entry.getKey(), entry.getValue(), plantRating.get(entry.getKey()));
        });
//        for (Map.Entry<String, Integer> entry : plantRarity.entrySet()) {
//            System.out.printf("- %s; Rarity: %d; Rating: ", entry.getKey(), entry.getValue());
//            for (Map.Entry<String, Double> rating : plantRating.entrySet()) {
//                if (plantRarity.containsKey(entry.getKey())) {
//                    double ratingValue = plantRating.get(entry.getKey());
//                    System.out.printf("%.2f%n", ratingValue);
//                    break;
//                }
//            }
//        }
    }
}
