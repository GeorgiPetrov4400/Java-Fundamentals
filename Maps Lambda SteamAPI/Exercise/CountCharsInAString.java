package MapsLambdaStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Map<Character, Integer> countCharacter = new LinkedHashMap<>();

        for (String text : input) {
            for (int i = 0; i < text.length(); i++) {
                char symbol = text.charAt(i);
                if (countCharacter.containsKey(symbol)) {
                    countCharacter.put(symbol, countCharacter.get(symbol) + 1);
                } else {
                    countCharacter.put(symbol, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : countCharacter.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
