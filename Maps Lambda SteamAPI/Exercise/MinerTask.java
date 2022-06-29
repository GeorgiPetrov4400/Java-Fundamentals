package MapsLambdaStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> resourceAndQuantity = new LinkedHashMap<>();
        while (!input.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (resourceAndQuantity.containsKey(input)) {
                resourceAndQuantity.put(input, resourceAndQuantity.get(input) + quantity);
            } else {
                resourceAndQuantity.put(input, quantity);
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resourceAndQuantity.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
