package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int countDays = 0;
        int spiceExtract = 0;
        int workersConsume = 26;
        int leftExtract = 0;

        while (!(startingYield < 100)) {
            countDays++;
            spiceExtract = startingYield - workersConsume;
            leftExtract += spiceExtract;

            startingYield -= 10;
        }
        int totalExtract = leftExtract - workersConsume;
        if (totalExtract < 0) {
            System.out.println(countDays);
            System.out.println(0);
        } else {
            System.out.println(countDays);
            System.out.println(totalExtract);
        }
    }
}
