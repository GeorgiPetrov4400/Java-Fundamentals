package MapsLambdaStreamAPIExercise;

import java.util.*;

public class ForceBook90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> usersInfo = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {
            if (input.contains(" | ")) {
                String[] data = input.split("\\s+\\|\\s+");
                String side = data[0];
                String user = data[1];

                usersInfo.putIfAbsent(side, new ArrayList<>());
                if (!usersInfo.get(side).contains(user)) {
                    usersInfo.get(side).add(user);
                }
            } else if (input.contains(" -> ")) {
                String[] data = input.split(" -> ");
                String user = data[0];
                String side = data[1];
                usersInfo.putIfAbsent(side, new ArrayList<>());
                usersInfo.forEach((k, v) -> {
                    v.remove(user);
                });
                usersInfo.get(side).add(user);
                System.out.printf("%s joins the %s side!%n", user, side);
            }

            input = scanner.nextLine();
        }
        usersInfo.forEach((key, value) -> {
            if (value.size() > 0) {
                System.out.printf("Side: %s, Members: %d%n", key, value.size());
                value.forEach(user -> System.out.printf("! %s%n", user));
            }
        });
    }
}
