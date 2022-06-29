package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> pieceComposer = new LinkedHashMap<>();

        Map<String, String> pieceKey = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\|");
            String piece = line[0];
            String composer = line[1];
            String key = line[2];
            pieceComposer.put(piece, composer);
            pieceKey.put(piece, key);
        }
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] data = input.split("\\|");
            String command = data[0];
            String pieceName = data[1];
            switch (command) {
                case "Add":
                    String composerName = data[2];
                    String keyName = data[3];
                    if (pieceComposer.containsKey(pieceName)) {
                        System.out.printf("%s is already in the collection!%n", pieceName);
                    } else {
                        pieceComposer.put(pieceName, composerName);
                        pieceKey.put(pieceName, keyName);
                        System.out.printf("%s by %s in %s added to the collection!%n", pieceName, composerName, keyName);
                    }
                    break;
                case "Remove":
                    if (pieceComposer.containsKey(pieceName) && pieceKey.containsKey(pieceName)) {
                        pieceComposer.remove(pieceName);
                        pieceKey.remove(pieceName);
                        System.out.printf("Successfully removed %s!%n", pieceName);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceName);
                    }
                    break;
                case "ChangeKey":
                    String newKey = data[2];
                    if (pieceComposer.containsKey(pieceName) && pieceKey.containsKey(pieceName)) {
                        pieceKey.put(pieceName, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", pieceName, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceName);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        pieceComposer.entrySet().stream().forEach(entry -> {
            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue(), pieceKey.get(entry.getKey()));
        });
    }
}
