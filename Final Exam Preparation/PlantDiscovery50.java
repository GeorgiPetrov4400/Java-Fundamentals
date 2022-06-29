package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plantRarity = new LinkedHashMap<>();

        Map<String, Double> plantRating = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("<->");
            String plantName = line[0];
            int rarity = Integer.parseInt(line[1]);
            plantRarity.put(plantName, rarity);
        }

        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String[] data = input.split(": ");
            String command = data[0];
            switch (command) {
                case "Rate":
                    String[] information = data[1].split(" - ");
                    String plant = information[0];
                    double rating = Double.parseDouble(information[1]);
                    if (plantRarity.containsKey(plant)) {
                        if (plantRating.containsKey(plant)) {
                            double currentRating = plantRating.get(plant);
                            double averageRating = (currentRating + rating) / 2;
                            plantRating.put(plant, averageRating);
                        } else {
                            plantRating.put(plant, rating);
                        }
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    String[] info = data[1].split(" - ");
                    String plantName = info[0];
                    int rarity = Integer.parseInt(info[1]);
                    if (plantRarity.containsKey(plantName)) {
                        plantRarity.put(plantName, rarity);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    String plantToReset = data[1];
                    if (plantRarity.containsKey(plantToReset)) {
                        if (plantRating.containsKey(plantToReset)) {
                            plantRating.put(plantToReset, 0.0);
                        }
                    } else {
                        System.out.println("error");
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entry : plantRarity.entrySet()) {
            System.out.printf("- %s; Rarity: %d; Rating: ", entry.getKey(), entry.getValue());
            for (Map.Entry<String, Double> rating : plantRating.entrySet()) {
                if (plantRarity.containsKey(entry.getKey())) {
                    double ratingValue = plantRating.get(entry.getKey());
                    System.out.printf("%.2f%n", ratingValue);
                    break;
                }
            }
        }
    }
}
