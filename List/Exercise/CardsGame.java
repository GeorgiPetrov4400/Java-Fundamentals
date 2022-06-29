package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (firstPlayerCards.size() != 0 && secondPlayerCards.size() != 0) {
            if (firstPlayerCards.get(0).equals(secondPlayerCards.get(0))) {
                firstPlayerCards.remove(firstPlayerCards.get(0));
                secondPlayerCards.remove(secondPlayerCards.get(0));
            } else if (firstPlayerCards.get(0) > secondPlayerCards.get(0)) {
                firstPlayerCards.add(firstPlayerCards.get(0));
                firstPlayerCards.remove(firstPlayerCards.get(0));
                firstPlayerCards.add(secondPlayerCards.get(0));
                secondPlayerCards.remove(secondPlayerCards.get(0));
            } else {
                secondPlayerCards.add(secondPlayerCards.get(0));
                secondPlayerCards.remove(secondPlayerCards.get(0));
                secondPlayerCards.add(firstPlayerCards.get(0));
                firstPlayerCards.remove(firstPlayerCards.get(0));
            }
        }
        if (secondPlayerCards.isEmpty()) {
            int sum = 0;
            for (Integer number : firstPlayerCards) {
                sum += number;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            int sum = 0;
            for (Integer number : secondPlayerCards) {
                sum += number;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
