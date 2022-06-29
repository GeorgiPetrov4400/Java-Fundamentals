package MapsLambdaStreamAPIExercise;

import java.util.*;

public class ForceBookKaloyan {
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
                boolean noneMatch = usersInfo.entrySet()
                        .stream()
                        .noneMatch(entry -> entry.getValue().contains(user));

                if (noneMatch) {
                    usersInfo.get(side).add(user);
                }

              /*  if (!usersInfo.containsKey(side)) {
                    usersInfo.put(side, new ArrayList<>());
                    if (!usersInfo.get(side).contains(user)) {
                        usersInfo.get(side).add(user);
                    } else {
                        usersInfo.get(side).add(user);
                    }
                } else {
                    if (usersInfo.get(side).contains(user)) {
                        input = scanner.nextLine();
                        continue;
                    } else {
                        usersInfo.get(side).add(user);
                    }
                } */
            } else if (input.contains(" -> ")) {
                String[] data = input.split(" -> ");
                String user = data[0];
                String side = data[1];

                usersInfo.forEach((k, v) -> v.remove(user));
                usersInfo.putIfAbsent(side, new ArrayList<>());
                usersInfo.get(side).add(user);
                System.out.printf("%s joins the %s side!%n", user, side);

               /* if (!usersInfo.containsKey(user)) {
                    if (usersInfo.containsKey(side)) {
                        usersInfo.get(side).add(user);
                        System.out.printf("%s joins the %s side!%n", user, side);
                        input = scanner.nextLine();
                        continue;
                    }
                    usersInfo.put(user, new ArrayList<>());
                    if (!usersInfo.get(user).contains(side)) {
                        usersInfo.get(user).add(side);
                        System.out.printf("%s joins the %s side!%n", user, side);
                    }
                } else {
                    if (!usersInfo.get(user).contains(side)) {
                        usersInfo.get(user).add(side);
                    } else {
                        usersInfo.get(user).add(side);
                    }
                } */
            }

            input = scanner.nextLine();
        }
        usersInfo.forEach((k, v) -> {
            if (v.size() != 0) {
                System.out.printf("Side: %s, Members: %d%n", k, v.size());
                v.forEach(user -> System.out.printf("! %s%n", user));
            }
        });
       /* for (Map.Entry<String, List<String>> entry : usersInfo.entrySet()) {
            if (entry.getValue().size() <= 0) {
                break;
            }
            System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
            String keyValue = entry.getKey();
            for (String value : usersInfo.get(keyValue)) {
                System.out.printf("! %s%n", value);
            }
        } */
    }
}
