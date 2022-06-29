package MidExamFebruary2022;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheAngryCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> priceRatings = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int entryPoint = Integer.parseInt(scanner.nextLine());
        String itemType = scanner.nextLine();

        int element = 0;
        int sumLeftItems = 0;
        int sumRightItems = 0;
        switch (itemType) {
            case "cheap":
                element = priceRatings.get(entryPoint);
                for (int i = entryPoint - 1; i >= 0; i--) {
                    if (priceRatings.get(i) < element) {
                        sumLeftItems += priceRatings.get(i);
                    }
                }
                for (int i = entryPoint + 1; i < priceRatings.size(); i++) {
                    if (priceRatings.get(i) < element) {
                        sumRightItems += priceRatings.get(i);
                    }
                }
                break;
            case "expensive":
                element = priceRatings.get(entryPoint);
                for (int i = entryPoint - 1; i >= 0; i--) {
                    if (priceRatings.get(i) >= element) {
                        sumLeftItems += priceRatings.get(i);
                    }
                }
                for (int i = entryPoint + 1; i < priceRatings.size(); i++) {
                    if (priceRatings.get(i) >= element) {
                        sumRightItems += priceRatings.get(i);
                    }
                }
                break;
        }
        if (sumLeftItems == sumRightItems) {
            System.out.printf("Left - %d", sumLeftItems);
        } else if (sumRightItems > sumLeftItems) {
            System.out.printf("Right - %d", sumRightItems);
        } else {
            System.out.printf("Left - %d", sumLeftItems);
        }
    }
}
