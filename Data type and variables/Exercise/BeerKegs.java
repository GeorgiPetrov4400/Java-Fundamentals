package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String biggestKeg = "";
        double maxVolume = 0.0;

        for (int i = 1; i <= n; i++) {
            String modelKeg = scanner.nextLine();
            double kegRadius = Double.parseDouble(scanner.nextLine());
            int kegHeight = Integer.parseInt(scanner.nextLine());

            double kegVolume = Math.PI * kegRadius * kegRadius * kegHeight;
            if (kegVolume > maxVolume) {
                maxVolume = kegVolume;
                biggestKeg = modelKeg;
            }
        }
        System.out.println(biggestKeg);
    }
}
