package MapsLambdaStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> usernameInfo = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String command = input[0];
            String username = input[1];

            switch (command) {
                case "register":
                    String licensePlate = input[2];
                    if (!usernameInfo.containsKey(username)) {
                        usernameInfo.put(username, licensePlate);
                        System.out.printf("%s registered %s successfully%n", username, licensePlate);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", licensePlate);
                        continue;
                    }
                    break;
                case "unregister":
                    if (usernameInfo.containsKey(username)) {
                        System.out.printf("%s unregistered successfully%n", username);
                        usernameInfo.remove(username);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", username);
                        continue;
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> entry : usernameInfo.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }

    }
}
