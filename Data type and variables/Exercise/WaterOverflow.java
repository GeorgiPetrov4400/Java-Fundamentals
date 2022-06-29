package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int waterVolume = 0;
        for (int i = 1; i <= n; i++) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if ((waterVolume + quantity) > 255) {
                System.out.println("Insufficient capacity!");
                continue;
            }
            waterVolume += quantity;
        }
        System.out.println(waterVolume);
    }
}
