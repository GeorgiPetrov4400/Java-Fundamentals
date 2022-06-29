package MapsLambdaStreamAPIExercise;

import java.util.*;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<Integer>> nameAndPoints = new LinkedHashMap<>();

        Map<String, List<Integer>> languageCount = new LinkedHashMap<>();

        while (!input.equals("exam finished")) {
            String[] data = input.split("-");
            String username = data[0];
            String language = data[1];

            if (language.equals("banned")) {
                nameAndPoints.remove(data[0]);
            } else {
                int points = Integer.parseInt(data[2]);
                nameAndPoints.putIfAbsent(username, new ArrayList<>());
                nameAndPoints.get(username).add(points);
                languageCount.putIfAbsent(language, new ArrayList<>());
                languageCount.get(language).add(1);
            }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        for (Map.Entry<String, List<Integer>> entry : nameAndPoints.entrySet()) {
            System.out.printf("%s | ", entry.getKey());
            String keyValue = entry.getKey();
            Collections.sort(nameAndPoints.get(keyValue));
            Collections.reverse(nameAndPoints.get(keyValue));
            for (Integer points : nameAndPoints.get(keyValue)) {
                System.out.printf("%d%n", points);
                break;
            }
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, List<Integer>> entry : languageCount.entrySet()) {
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue().size());
        }
    }
}
