package MapsLambdaStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Double> productAndPrice = new LinkedHashMap<>();

        Map<String, Integer> productAndQuantity = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String[] data = input.split("\\s+");
            String product = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity = Integer.parseInt(data[2]);
            if (productAndPrice.containsKey(product)) {
                productAndPrice.put(product, price);
                int currentQuantity = productAndQuantity.get(product);
                productAndQuantity.put(product, currentQuantity + quantity);
            } else {
                productAndPrice.put(product, price);
                productAndQuantity.put(product, quantity);
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entryPrice : productAndPrice.entrySet()) {
            for (Map.Entry<String, Integer> entryQuantity : productAndQuantity.entrySet()) {
                if (entryPrice.getKey().equals(entryQuantity.getKey())) {
                    double totalPrice = entryPrice.getValue() * entryQuantity.getValue();
                    System.out.printf("%s -> %.2f%n", entryPrice.getKey(), totalPrice);
                }
            }

        }

    }
}
