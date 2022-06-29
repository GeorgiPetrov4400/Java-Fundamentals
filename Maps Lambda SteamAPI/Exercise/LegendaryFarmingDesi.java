package MapsLambdaStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarmingDesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materialAndItem = new LinkedHashMap<>();
        materialAndItem.put("shards", 0);
        materialAndItem.put("fragments", 0);
        materialAndItem.put("motes", 0);

        Map<String, Integer> junkItem = new LinkedHashMap<>();

        boolean isOver = false;
        while (!isOver) {
            String input = scanner.nextLine();
            String[] inputData = input.split(" ");
            for (int i = 0; i < inputData.length; i += 2) {
                int quantity = Integer.parseInt(inputData[i]);
                String material = inputData[i + 1].toLowerCase();
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = materialAndItem.get(material);
                    materialAndItem.put(material, currentQuantity + quantity);
                    if (materialAndItem.get(material) >= 250) {
                        if (material.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (material.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else if (material.equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                        }
                        materialAndItem.put(material, materialAndItem.get(material) - 250);
                        isOver = true;
                        break;
                    }
                } else {
                    // junkItem.putIfAbsent(material, quantity);
                    if (!junkItem.containsKey(material)) {
                        junkItem.put(material, quantity);
                    } else {
                        int currentQuantity = junkItem.get(material);
                        junkItem.put(material, currentQuantity + quantity);
                    }
                }
            }
        }
        for (Map.Entry<String, Integer> entry : materialAndItem.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : junkItem.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }
}
