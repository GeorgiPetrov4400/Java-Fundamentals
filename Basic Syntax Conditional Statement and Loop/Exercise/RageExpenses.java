package BasicSintaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int trashedHeadsetCount = 0;
        int trashedMouseCount = 0;
        int trashedKeyboardCount = 0;
        int trashedDisplayCount = 0;
        for (int i = 1; i <= lostGames; i++) {
            if (i % 2 == 0) {
                trashedHeadsetCount++;
            }
            if (i % 3 == 0) {
                trashedMouseCount++;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                trashedKeyboardCount++;
            }
            if (trashedKeyboardCount >= 2 && i % 2 == 0 && i % 3 == 0 && trashedKeyboardCount % 2 == 0) {
                trashedDisplayCount++;
            }
        }
        double totalSum = trashedHeadsetCount * headsetPrice + trashedMouseCount * mousePrice
                + trashedKeyboardCount * keyboardPrice + trashedDisplayCount * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", totalSum);
    }
}
